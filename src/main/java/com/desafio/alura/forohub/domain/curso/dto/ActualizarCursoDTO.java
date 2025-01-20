package com.desafio.alura.forohub.domain.curso.dto;

import com.desafio.alura.forohub.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}
