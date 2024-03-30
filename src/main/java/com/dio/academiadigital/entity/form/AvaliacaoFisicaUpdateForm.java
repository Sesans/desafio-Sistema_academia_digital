package com.dio.academiadigital.entity.form;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateForm {

    @NotEmpty(message = "Campo não pode estar vazio!")
    private double peso;

    @NotEmpty(message = "Campo não pode estar vazio!")
    private double altura;
}
