package com.govmt.sgd.mappers;

import org.springframework.stereotype.Component;

import com.govmt.sgd.dto.request.OrgaoRequest;
import com.govmt.sgd.model.Orgao;

@Component
public class OrgaoMapper {

    public static Orgao toOrgaoFromRequest(OrgaoRequest request){
        return new Orgao(
            request.id(),
            request.nome(),
            request.acronimo(),
            request.criado_em(),
            request.atualizado_em()
        );
    }

    public static OrgaoRequest toRequestFromOrgao(Orgao orgao){
        return new OrgaoRequest(
            orgao.getId(), 
            orgao.getNome(), 
            orgao.getAcronimo(), 
            orgao.getCriado_em(), 
            orgao.getAtualizado_em()
        ); 
    }
}
