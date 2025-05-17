package com.colvir.webinar5.service;

import com.colvir.webinar5.dto.EmployeeDto;
import com.colvir.webinar5.mapper.EmployeeMapper;
import com.colvir.webinar5.model.Employee;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private AtomicLong counter = new AtomicLong();

    private final EmployeeMapper employeeMapper;

    @Getter
    public List<Employee> employees = new CopyOnWriteArrayList<>();

    public Optional<EmployeeDto> getById(Long id) {
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().map(employeeMapper::toDto);
    }

    public void save(EmployeeDto employee) {
        if (employee.getId() == null) {
            employee.setId(counter.incrementAndGet());
            employees.add(employeeMapper.toEntity(employee));
        } else {
            getById(employee.getId()).map(employeeMapper::toEntity).ifPresent(it -> employees.set(employees.indexOf(it), employeeMapper.toEntity(employee)));
        }
    }

    public Optional<?> delete(EmployeeDto employee) {
        boolean remove = employees.remove(employeeMapper.toEntity(employee));
        return remove ? Optional.of(employee) : Optional.empty();
    }
}
