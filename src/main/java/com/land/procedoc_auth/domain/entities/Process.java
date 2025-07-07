package com.land.procedoc_auth.domain.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "process")

public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    //transformar em enum dps
    private String Assunto;
    private String AssuntoDetalhado;

    private String Observacao;

    @Enumerated(EnumType.STRING)
    private NaturezaProcesso naturezaDoProcesso;


    @ManyToOne
    private Department departmentAtual;

    private LocalDateTime criadoEm;

    @OneToMany(mappedBy = "processo")
    private List<Document> documentos;

}
