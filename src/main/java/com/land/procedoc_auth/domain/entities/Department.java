package com.land.procedoc_auth.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Department {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    @OneToMany(mappedBy = "departamentoAtual")
    private List<Process> processos;

    @OneToMany(mappedBy = "departamentoAtual")
    private List<Document> documents;

}
