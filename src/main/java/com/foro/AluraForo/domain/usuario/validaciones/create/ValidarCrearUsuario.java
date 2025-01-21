package com.foro.AluraForo.domain.usuario.validaciones.create;

import com.foro.AluraForo.domain.usuario.dto.CrearUsuarioDTO;

public interface ValidarCrearUsuario {
    void validate(CrearUsuarioDTO data);
}