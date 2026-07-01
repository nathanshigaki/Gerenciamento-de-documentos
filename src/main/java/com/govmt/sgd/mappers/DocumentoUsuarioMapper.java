package com.govmt.sgd.mappers;

import com.govmt.sgd.dto.request.DocumentoRequest;
import com.govmt.sgd.dto.request.UsuarioRequest;
import com.govmt.sgd.dto.response.DocumentoResponse;
import com.govmt.sgd.dto.response.DocumentoUsuarioResponse;
import com.govmt.sgd.dto.response.OrgaoResponse;
import com.govmt.sgd.dto.response.UsuarioResponse;

import org.springframework.stereotype.Component;

import com.govmt.sgd.dto.request.DocumentoUsuarioRequest;
import com.govmt.sgd.dto.request.OrgaoRequest;
import com.govmt.sgd.model.Documento;
import com.govmt.sgd.model.DocumentoUsuario;
import com.govmt.sgd.model.Orgao;
import com.govmt.sgd.model.Usuario;

@Component
public class DocumentoUsuarioMapper {

    private final DocumentoMapper documentoMapper = new DocumentoMapper();
    private final UsuarioMapper usuarioMapper = new UsuarioMapper();

    public DocumentoUsuario toDocumentoUsuarioFromRequest(DocumentoUsuarioRequest request, DocumentoRequest documentoRequest, OrgaoRequest orgaoRequest, UsuarioRequest usuarioRequest){
        return new DocumentoUsuario(
            request.id(),
            documentoMapper.toDocumentoFromRequest(documentoRequest, orgaoRequest),
            usuarioMapper.toUsuarioFromRequest(usuarioRequest),
            request.cargo(),
            request.criadoEm(),
            request.atualizadoEm()
        );
    }

    public DocumentoUsuarioRequest toRequestFromDocumentoUsuario(DocumentoUsuario documentoUsuario){
        return new DocumentoUsuarioRequest(
            documentoUsuario.getId(),
            documentoUsuario.getDocumento().getId(),
            documentoUsuario.getUsuario().getId(),
            documentoUsuario.getCargo(),
            documentoUsuario.getCriadoEm(),
            documentoUsuario.getAtualizadoEm()
        );
    }

    public DocumentoUsuario toDocumentoUsuarioFromResponse(DocumentoUsuarioResponse response, DocumentoResponse documentoResponse, OrgaoResponse orgaoResponse, UsuarioResponse usuarioResponse){
        return new DocumentoUsuario(
            response.id(),
            documentoMapper.toDocumentoFromResponse(documentoResponse, orgaoResponse),
            usuarioMapper.toUsuarioFromResponse(usuarioResponse),
            response.cargo(),
            response.criadoEm(),
            response.atualizadoEm()
        );
    }

    public DocumentoUsuarioResponse toResponseFromDocumentoUsuario(DocumentoUsuario documentoUsuario, Documento documento, Orgao orgao, Usuario usuario){
        return new DocumentoUsuarioResponse(
            documentoUsuario.getId(),
            documentoMapper.toResponseFromDocumento(documento, orgao),
            usuarioMapper.toResponseFromUsuario(usuario),
            documentoUsuario.getCargo(),
            documentoUsuario.getCriadoEm(),
            documentoUsuario.getAtualizadoEm()
        );
    }
}
