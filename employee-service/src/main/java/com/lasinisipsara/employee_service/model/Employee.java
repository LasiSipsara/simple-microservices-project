package com.lasinisipsara.employee_service.model;

public record Employee(
        Long id,
        Long departmentId,
        String name,
        String position
) {
}
