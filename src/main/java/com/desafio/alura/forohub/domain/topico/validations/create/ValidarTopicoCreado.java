package com.desafio.alura.forohub.domain.topico.validations.create;

import com.desafio.alura.forohub.domain.topico.dto.CrearTopicoDTO;

public interface ValidarTopicoCreado {

    void validate(CrearTopicoDTO data);
}