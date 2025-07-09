package com.land.procedoc_auth.domain.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    //transformar em enum dps
    private String tipo;

    @Enumerated(EnumType.STRING)
    private FormaDocumento formaDocumento;

    @Lob
    private String conteudoEscrito; // se ESCREVER

    private String caminhoArquivo; // se ANEXAR

    private LocalDateTime criadoEm;

    @ManyToOne(optional = true)
    @JoinColumn(name = "processo_id")
    private Process processo;
}
