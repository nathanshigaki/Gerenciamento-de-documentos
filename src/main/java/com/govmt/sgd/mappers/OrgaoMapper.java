package com.govmt.sgd.mappers;

import org.mapstruct.Mapper;
import com.govmt.sgd.dto.request.OrgaoRequest;
import com.govmt.sgd.dto.response.OrgaoResponse;
import com.govmt.sgd.model.Orgao;

@Mapper(componentModel = "spring")
public interface OrgaoMapper {

    Orgao toOrgaoFromRequest(OrgaoRequest request);
    OrgaoRequest toRequestFromOrgao(Orgao orgao);
    
    Orgao toOrgaoFromResponse(OrgaoResponse response);
    OrgaoResponse toResponseFromOrgao(Orgao orgao);
}
