package com.govmt.sgd.mappers;

import org.springframework.stereotype.Component;

import com.govmt.sgd.dto.request.DocumentoRequest;
import com.govmt.sgd.dto.request.OrgaoRequest;
import com.govmt.sgd.model.Documento;
import com.govmt.sgd.model.Orgao;

@Component
public class DocumentoMapper {

    public Documento toDocumentoFromRequest(DocumentoRequest documentRequest, OrgaoRequest orgaoRequest){


        return new Documento(
            documentRequest.id(),
            OrgaoMapper.toOrgaoFromRequest(orgaoRequest),
            documentRequest.sigdoc(),
            documentRequest.chegouEm(),
            documentRequest.concluiuEm(),
            documentRequest.emEspera(),
            documentRequest.valor(),
            documentRequest.situacao(),
            documentRequest.caracterizacaoTi(),
            documentRequest.iniciado(),
            documentRequest.condes(),
            documentRequest.resumo(),
            documentRequest.tipoContratacao(),
            documentRequest.objeto(),
            documentRequest.recomendacao(),
            documentRequest.parecerFinal(),
            documentRequest.deletadoEm(),
            documentRequest.criadoEm(),
            documentRequest.atualizadoEm()
        );
    }


    public DocumentoRequest toRequestFromDocumento(Documento documento, Orgao orgao){
        OrgaoRequest request = OrgaoMapper.toRequestFromOrgao(orgao);

        return new DocumentoRequest(
            documento.getId(),
            request.id(), 
            documento.getSigdoc(), 
            documento.getChegouEm(), 
            documento.getConcluiuEm(), 
            documento.getEmEspera(), 
            documento.getValor(), 
            documento.getSituacao(), 
            documento.getCaracterizacaoTi(), 
            documento.getIniciado(), 
            documento.getCondes(), 
            documento.getResumo(), 
            documento.getTipoContratacao(), 
            documento.getObjeto(), 
            documento.getRecomendacao(), 
            documento.getParecerFinal(), 
            documento.getDeletadoEm(), 
            documento.getCriadoEm(), 
            documento.getAtualizadoEm()
        );
    }
}