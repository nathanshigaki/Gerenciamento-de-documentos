package com.govmt.sgd.dto.request;

import java.time.LocalDateTime;
import java.util.UUID;

public record OrgaoRequest(
    UUID id,
    String nome,
    String acronimo,
    LocalDateTime criadoEm,
    LocalDateTime atualizadoEm
) {}
