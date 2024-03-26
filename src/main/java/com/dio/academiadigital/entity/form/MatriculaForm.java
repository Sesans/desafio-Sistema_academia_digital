package com.dio.academiadigital.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class MatriculaForm {

    @NotNull(message = "O campo deve ser preenchido!")
    @Positive(message = "O campo ID do aluno deve ser um inteiro positivo.")
    private Long alunoId;
}
