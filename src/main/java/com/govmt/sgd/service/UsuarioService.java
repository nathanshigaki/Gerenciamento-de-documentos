package com.govmt.sgd.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.govmt.sgd.dto.request.UsuarioRequest;
import com.govmt.sgd.dto.response.UsuarioResponse;
import com.govmt.sgd.mappers.UsuarioMapper;
import com.govmt.sgd.model.Usuario;
import com.govmt.sgd.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioResponse createUsuario(UsuarioRequest usuarioRequest){
        if (usuarioRequest.nome().strip() == null){
            throw new IllegalArgumentException("Nome vazio");
        }

        if (usuarioRequest.senha() == null){
            throw new IllegalArgumentException("Senha vazia");
        }

        Usuario usuarioSalvar = usuarioMapper.toUsuarioFromRequest(usuarioRequest);
        Usuario usuarioSalvado = usuarioRepository.save(usuarioSalvar);
        return usuarioMapper.toResponseFromUsuario(usuarioSalvado);
    }

    public List<UsuarioResponse> getAll(){
        return usuarioRepository.findAll()
                .stream()
                .map(usuarioMapper::toResponseFromUsuario)
                .toList();
    }

    public UsuarioResponse findById(UUID id){
        return usuarioRepository.findById(id)
                .map(usuarioMapper::toResponseFromUsuario)
                .orElseThrow(() -> new RuntimeException("N encontrado"));
    }

    public UsuarioResponse updateUsuario(UsuarioRequest usuarioRequest){
        UsuarioResponse usuarioResponse = findById(usuarioRequest.id());
        Usuario usuarioUpdate = usuarioMapper.toUsuarioFromResponse(usuarioResponse);

        if (usuarioResponse.nome() != usuarioRequest.nome()) usuarioUpdate.setNome(usuarioRequest.nome());
        if (usuarioResponse.email() != usuarioRequest.email()) usuarioUpdate.setEmail(usuarioRequest.email());
        if (usuarioResponse.senha() != usuarioRequest.senha() && usuarioRequest.senha() != null) usuarioUpdate.setSenha(usuarioRequest.senha());
        if (usuarioResponse.permissao() != usuarioRequest.permissao()) usuarioUpdate.setPermissao(usuarioRequest.permissao());
        if (usuarioResponse.atualizadoEm() != usuarioRequest.atualizadoEm()) usuarioUpdate.setAtualizadoEm(usuarioRequest.atualizadoEm());

        Usuario usuarioSalvo = usuarioRepository.save(usuarioUpdate);
        return usuarioMapper.toResponseFromUsuario(usuarioSalvo);
    }

    public void deleteUsuario(UUID id){
        UsuarioResponse usuarioExiste = findById(id);
        Usuario usuarioApagar = usuarioMapper.toUsuarioFromResponse(usuarioExiste);
        usuarioRepository.delete(usuarioApagar);
    }
}
