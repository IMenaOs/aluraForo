package com.foro.AluraForo.domain.curso.dto;

import com.foro.AluraForo.domain.curso.Categoria;
import com.foro.AluraForo.domain.curso.Curso;

public record DetalleCursoDTO(
        Long id,
        String name,
        Categoria categoria,
        Boolean activo) {

    public DetalleCursoDTO(Curso curso){
        this(
                curso.getId(),
                curso.getName(),
                curso.getCategoria(),
                curso.getActivo());
    }

}