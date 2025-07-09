package com.land.procedoc_auth.api.dto;

import com.land.procedoc_auth.domain.entities.Document;
import com.land.procedoc_auth.domain.entities.FormaDocumento;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Setter
public class DocumentResponseDTO {

    private UUID id;
    private String tipo;
    private FormaDocumento formaDocumento;
    private String conteudoEscrito;
    private String caminhoArquivo;
    private LocalDateTime criadoEm;

    // Construtor que recebe a entidade Document e popula os campos do DTO
    public DocumentResponseDTO(Document document) {
        this.id = document.getId();
        this.tipo = document.getTipo();
        this.formaDocumento = document.getFormaDocumento();
        this.conteudoEscrito = document.getConteudoEscrito();
        this.caminhoArquivo = document.getCaminhoArquivo();
        this.criadoEm = document.getCriadoEm();
    }


}
