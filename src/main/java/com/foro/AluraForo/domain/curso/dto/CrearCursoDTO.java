package com.foro.AluraForo.domain.curso.dto;

import com.foro.AluraForo.domain.curso.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearCursoDTO(
        @NotBlank String name,
        @NotNull Categoria categoria) {
}
