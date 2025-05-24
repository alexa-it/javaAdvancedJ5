package com.colvir.webinar5.mapper;

import com.colvir.webinar5.dto.EmployeeDto;
import com.colvir.webinar5.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {
    @Mapping(target = "country", source = "employee.citizenship")
    EmployeeDto toDto(Employee employee);

    @Mapping(target = "citizenship", source = "employee.country")
    Employee toEntity(EmployeeDto employee);
}
