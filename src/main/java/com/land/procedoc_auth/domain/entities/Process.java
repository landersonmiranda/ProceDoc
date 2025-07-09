package com.land.procedoc_auth.domain.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "process")
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    //transformar em enum dps
    private String assunto;
    private String assuntoDetalhado;

    private String observacao;

    @Enumerated(EnumType.STRING)
    private NaturezaProcesso naturezaDoProcesso;


    @ManyToOne
    private Department departmentAtual;

    private LocalDateTime criadoEm;

    @OneToMany(mappedBy = "processo")
    private List<Document> documentos;



}
