package com.foro.AluraForo.domain.usuario.dto;

import com.foro.AluraForo.domain.usuario.Role;

public record ActualizarUsuarioDTO(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}