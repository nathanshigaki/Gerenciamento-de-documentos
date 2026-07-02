package com.govmt.sgd.mappers;

import org.mapstruct.Mapper;

import com.govmt.sgd.dto.request.UsuarioRequest;
import com.govmt.sgd.dto.response.UsuarioResponse;
import com.govmt.sgd.model.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toUsuarioFromRequest(UsuarioRequest request);
    UsuarioRequest toRequestFromUsuario(Usuario usuario);
    
    Usuario toUsuarioFromResponse(UsuarioResponse response);
    UsuarioResponse toResponseFromUsuario(Usuario usuario);
}
