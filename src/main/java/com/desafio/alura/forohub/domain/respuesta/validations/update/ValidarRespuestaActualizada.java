package com.desafio.alura.forohub.domain.respuesta.validations.update;

import com.desafio.alura.forohub.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}