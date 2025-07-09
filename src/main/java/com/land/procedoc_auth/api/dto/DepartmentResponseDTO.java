package com.land.procedoc_auth.api.dto;

import com.land.procedoc_auth.domain.entities.Department;

import java.util.UUID;

public class DepartmentResponseDTO {
    private UUID id;
    private String nome;

    public DepartmentResponseDTO(Department department) {
        this.id = department.getId();
        this.nome = department.getNome();
    }
}