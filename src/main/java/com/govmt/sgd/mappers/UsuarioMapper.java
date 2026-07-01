package com.govmt.sgd.mappers;

import org.springframework.stereotype.Component;

import com.govmt.sgd.dto.request.UsuarioRequest;
import com.govmt.sgd.dto.response.UsuarioResponse;
import com.govmt.sgd.model.Usuario;

@Component
public class UsuarioMapper {

    public Usuario toUsuarioFromRequest(UsuarioRequest request){
        return new Usuario(
            request.id(),
            request.nome(),
            request.email(),
            request.senha(),
            request.permissao(),
            request.criadoEm(),
            request.atualizadoEm()
        );
    }

    public UsuarioRequest toRequestFromUsuario(Usuario usuario){
        return new UsuarioRequest(
            usuario.getId(),
            usuario.getNome(),
            usuario.getEmail(),
            usuario.getSenha(),
            usuario.getPermissao(),
            usuario.getCriadoEm(),
            usuario.getAtualizadoEm()
        );
    }

    public Usuario toUsuarioFromResponse(UsuarioResponse response){
        return new Usuario(
            response.id(),
            response.nome(),
            response.email(),
            response.senha(),
            response.permissao(),
            response.criadoEm(),
            response.atualizadoEm()
        );
    }

    public UsuarioResponse toResponseFromUsuario(Usuario usuario){
        return new UsuarioResponse(
            usuario.getId(),
            usuario.getNome(),
            usuario.getEmail(),
            usuario.getSenha(),
            usuario.getPermissao(),
            usuario.getCriadoEm(),
            usuario.getAtualizadoEm()
        );
    }
}
