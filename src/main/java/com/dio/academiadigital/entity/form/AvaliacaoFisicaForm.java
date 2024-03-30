package com.dio.academiadigital.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm extends AvaliacaoFisicaUpdateForm {
    @NotEmpty(message = "O campo não pode estar vazio!")
    @Positive(message = "O id deve ser um inteiro positivo!")
    private Long alunoId;
}
