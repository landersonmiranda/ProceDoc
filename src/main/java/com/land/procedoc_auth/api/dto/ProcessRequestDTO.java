package com.land.procedoc_auth.api.dto;

import com.land.procedoc_auth.domain.entities.Department;
import com.land.procedoc_auth.domain.entities.NaturezaProcesso;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProcessRequestDTO {

    private String Assunto;
    private String AssuntoDetalhado;

    private String Observacao;

    @Enumerated(EnumType.STRING)
    private NaturezaProcesso naturezaDoProcesso;


    @ManyToOne
    private Department departmentAtual;



}
