package com.lasinisipsara.department_service.model;

public record Employee(
        Long id,
        Long departmentId,
        String name,
        String position
) {
}
