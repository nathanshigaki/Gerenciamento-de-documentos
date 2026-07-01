package com.govmt.sgd.mappers;

import org.springframework.stereotype.Component;

import com.govmt.sgd.dto.request.DocumentoRequest;
import com.govmt.sgd.dto.request.OrgaoRequest;
import com.govmt.sgd.dto.response.DocumentoResponse;
import com.govmt.sgd.dto.response.OrgaoResponse;
import com.govmt.sgd.model.Documento;
import com.govmt.sgd.model.Orgao;

@Component
public class DocumentoMapper {

    private final OrgaoMapper orgaoMapper = new OrgaoMapper();

    public Documento toDocumentoFromRequest(DocumentoRequest documentRequest, OrgaoRequest orgaoRequest){

        return new Documento(
            documentRequest.id(),
            orgaoMapper.toOrgaoFromRequest(orgaoRequest),
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
        return new DocumentoRequest(
            documento.getId(),
            orgaoMapper.toRequestFromOrgao(orgao).id(), 
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

    public Documento toDocumentoFromResponse(DocumentoResponse documentoResponse, OrgaoResponse orgaoResponse){
        return new Documento(
            documentoResponse.id(),
            orgaoMapper.toOrgaoFromResponse(orgaoResponse),
            documentoResponse.sigdoc(),
            documentoResponse.chegouEm(),
            documentoResponse.concluiuEm(),
            documentoResponse.emEspera(),
            documentoResponse.valor(),
            documentoResponse.situacao(),
            documentoResponse.caracterizacaoTi(),
            documentoResponse.iniciado(),
            documentoResponse.condes(),
            documentoResponse.resumo(),
            documentoResponse.tipoContratacao(),
            documentoResponse.objeto(),
            documentoResponse.recomendacao(),
            documentoResponse.parecerFinal(),
            documentoResponse.deletadoEm(),
            documentoResponse.criadoEm(),
            documentoResponse.atualizadoEm()
        );
    }

    public DocumentoResponse toResponseFromDocumento(Documento documento, Orgao orgao){
        return new DocumentoResponse(
            documento.getId(),
            orgaoMapper.toResponseFromOrgao(orgao), 
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