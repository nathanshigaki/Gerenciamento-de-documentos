package com.govmt.sgd.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record DocumentoUsuarioResponse(
    UUID id,
    DocumentoResponse documentoId,
    UsuarioResponse usuarioId,
    String cargo,
    LocalDateTime criadoEm,
    LocalDateTime atualizadoEm
) {}
