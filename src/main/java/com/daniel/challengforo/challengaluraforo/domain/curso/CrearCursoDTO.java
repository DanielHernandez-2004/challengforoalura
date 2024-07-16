package com.daniel.challengforo.challengaluraforo.domain.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearCursoDTO(
        @NotBlank
        String name,

        @NotNull
        Categoria categoria
) {
}
