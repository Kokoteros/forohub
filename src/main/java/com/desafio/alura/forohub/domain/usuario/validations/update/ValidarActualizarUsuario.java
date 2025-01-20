package com.desafio.alura.forohub.domain.usuario.validations.update;

import com.desafio.alura.forohub.domain.usuario.dto.ActualizarUsuarioDTO;

public interface ValidarActualizarUsuario {
    void validate(ActualizarUsuarioDTO data);
}