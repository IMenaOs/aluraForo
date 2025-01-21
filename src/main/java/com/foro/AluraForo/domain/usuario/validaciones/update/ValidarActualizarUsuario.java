package com.foro.AluraForo.domain.usuario.validaciones.update;

import com.foro.AluraForo.domain.usuario.dto.ActualizarUsuarioDTO;

public interface ValidarActualizarUsuario {
    void validate(ActualizarUsuarioDTO data);
}