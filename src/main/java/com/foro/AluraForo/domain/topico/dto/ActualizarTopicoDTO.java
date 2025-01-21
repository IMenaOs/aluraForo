package com.foro.AluraForo.domain.topico.dto;

import com.foro.AluraForo.domain.topico.Estado;

public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}
