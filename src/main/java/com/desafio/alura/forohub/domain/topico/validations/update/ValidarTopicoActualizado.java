package com.desafio.alura.forohub.domain.topico.validations.update;

import com.desafio.alura.forohub.domain.topico.dto.ActualizarTopicoDTO;

public interface ValidarTopicoActualizado {
    void validate(ActualizarTopicoDTO data);
}