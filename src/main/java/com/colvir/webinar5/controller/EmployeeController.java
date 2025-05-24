package com.colvir.webinar5.controller;

import com.colvir.webinar5.dto.EmployeeDto;
import com.colvir.webinar5.model.Employee;
import com.colvir.webinar5.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employees")
@Validated
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok(employeeService.getEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getById(@PathVariable("id") Long id) {
        return employeeService.getById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid EmployeeDto employee) {
        if (employee.getId() != null) {
            throw new IllegalArgumentException("Employee id must be null");
        }
        employeeService.save(employee);
    }

    @PutMapping()
    public void update(@RequestBody EmployeeDto employee) {
        employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return employeeService.getById(id)
                .map(employeeService::delete)
                .map(it -> ResponseEntity.noContent().build())
                .orElse(ResponseEntity.notFound().build());
    }
}
