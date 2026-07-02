package com.govmt.sgd.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.govmt.sgd.dto.request.DocumentoRequest;
import com.govmt.sgd.dto.response.DocumentoResponse;
import com.govmt.sgd.model.Documento;

@Mapper(componentModel = "spring", uses = {OrgaoMapper.class})
public interface DocumentoMapper {

    @Mapping(source = "orgaoId", target = "orgao.id")
    Documento toDocumentoFromRequest(DocumentoRequest request);

    @Mapping(source = "orgao.id", target = "orgaoId")
    DocumentoRequest toRequestFromDocumento(Documento documento);
    
    Documento toDocumentoFromResponse(DocumentoResponse response);
    DocumentoResponse toResponseFromDocumento(Documento documento);
}