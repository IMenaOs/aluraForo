package com.foro.AluraForo.domain.topico.validaciones.create;

import com.foro.AluraForo.domain.topico.dto.CrearTopicoDTO;

public interface ValidarTopicoCreado {

    void validate(CrearTopicoDTO data);
}