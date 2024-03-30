package com.dio.academiadigital.entity.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoUpdateForm {

    @NotEmpty(message = "O campo deve ser preenchido!")
    @Size(min = 3, max = 50, message = "'${validatedValue' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "O campo deve ser preenchido!")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;

    @NotNull(message = "Preencha o campo corretamente.")
    @Past(message = "Data '${validatedValue}' é invalida!")
    private LocalDate dataDeNascimento;
}
