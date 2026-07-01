package com.govmt.sgd.mappers;

import org.springframework.stereotype.Component;

import com.govmt.sgd.dto.request.OrgaoRequest;
import com.govmt.sgd.dto.response.OrgaoResponse;
import com.govmt.sgd.model.Orgao;

@Component
public class OrgaoMapper {

    public Orgao toOrgaoFromRequest(OrgaoRequest request){
        return new Orgao(
            request.id(),
            request.nome(),
            request.acronimo(),
            request.criadoEm(),
            request.atualizadoEm()
        );
    }

    public OrgaoRequest toRequestFromOrgao(Orgao orgao){
        return new OrgaoRequest(
            orgao.getId(), 
            orgao.getNome(), 
            orgao.getAcronimo(), 
            orgao.getCriadoEm(), 
            orgao.getAtualizadoEm()
        ); 
    }

    public Orgao toOrgaoFromResponse(OrgaoResponse response){
        return new Orgao(
            response.id(),
            response.nome(),
            response.acronimo(),
            response.criadoEm(),
            response.atualizadoEm()
        );
    }

    public OrgaoResponse toResponseFromOrgao(Orgao orgao){
        return new OrgaoResponse(
            orgao.getId(), 
            orgao.getNome(), 
            orgao.getAcronimo(), 
            orgao.getCriadoEm(), 
            orgao.getAtualizadoEm()
        );
    }
}
