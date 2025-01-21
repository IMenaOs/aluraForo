package com.foro.AluraForo.domain.curso.dto;

import com.foro.AluraForo.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo
) {

}
