package com.land.procedoc_auth.api.dto;

import com.land.procedoc_auth.domain.entities.Department;
import com.land.procedoc_auth.domain.entities.NaturezaProcesso;
import com.land.procedoc_auth.domain.entities.Process;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class ProcessResponseDTO {

    private UUID id;
    private String assunto;
    private String assuntoDetalhado;
    private String observacao;
    private NaturezaProcesso naturezaDoProcesso;
    private DepartmentResponseDTO departmentAtual;
    private LocalDateTime criadoEm;
    private List<DocumentResponseDTO> documentos;

    // Construtor que converte da entidade Process
    public ProcessResponseDTO(Process process) {
        this.id = process.getId();
        this.assunto = process.getAssunto();
        this.assuntoDetalhado = process.getAssuntoDetalhado();
        this.observacao = process.getObservacao();
        this.naturezaDoProcesso = process.getNaturezaDoProcesso();
        // Se DepartmentResponseDTO existir:
        this.departmentAtual = new DepartmentResponseDTO(process.getDepartmentAtual());
        this.criadoEm = process.getCriadoEm();

        // Converte lista de documentos para DTOs
        if(process.getDocumentos() != null) {
            this.documentos = process.getDocumentos().stream()
                    .map(DocumentResponseDTO::new)
                    .toList();
        }
    }

    // getters e setters (ou lombok)
}

