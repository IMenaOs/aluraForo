package com.foro.AluraForo.domain.respuesta.validaciones.update;

import com.foro.AluraForo.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
