package com.desafio.alura.forohub.domain.topico.dto;

import com.desafio.alura.forohub.domain.topico.Estado;

public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}