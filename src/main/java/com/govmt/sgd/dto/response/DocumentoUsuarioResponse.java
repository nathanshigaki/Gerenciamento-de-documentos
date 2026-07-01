package com.govmt.sgd.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

import com.govmt.sgd.model.Documento;
import com.govmt.sgd.model.Usuario;

public record DocumentoUsuarioResponse(
    UUID id,
    Documento documentoId,
    Usuario usuarioId,
    String cargo,
    LocalDateTime criadoEm,
    LocalDateTime atualizadoEm
) {}
