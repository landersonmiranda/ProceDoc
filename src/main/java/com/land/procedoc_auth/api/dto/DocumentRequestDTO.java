package com.land.procedoc_auth.api.dto;

import com.land.procedoc_auth.domain.entities.FormaDocumento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class DocumentRequestDTO {
    private String tipo;

    @Enumerated(EnumType.STRING)
    private FormaDocumento formaDocumento;

    @Lob
    private String conteudoEscrito; // se ESCREVER

    private String caminhoArquivo; // se ANEXAR

    private UUID processoId;

}
