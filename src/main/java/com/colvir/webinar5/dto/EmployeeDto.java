package com.colvir.webinar5.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmployeeDto {
    @Min(0)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String position;
    @Max(100)
    private BigDecimal salary;
    private String country;
}
