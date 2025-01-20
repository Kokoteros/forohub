package com.desafio.alura.forohub.domain.respuesta.validations.create;

import com.desafio.alura.forohub.domain.respuesta.dto.CrearRespuestaDTO;

public interface ValidarRespuestaCreada {
    void validate(CrearRespuestaDTO data);
}