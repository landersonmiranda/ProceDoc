package com.land.procedoc_auth.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Department {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    @OneToMany(mappedBy = "departamentoAtual")
    private List<Process> processos;

    @OneToMany(mappedBy = "departamentoAtual")
    private List<Document> documents;

}
