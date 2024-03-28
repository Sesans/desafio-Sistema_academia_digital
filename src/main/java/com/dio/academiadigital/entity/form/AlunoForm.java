package com.dio.academiadigital.entity.form;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoForm {

    @NotEmpty(message = "O campo deve ser preenchido!")
    @Size(min = 3, max = 50, message = "'${validatedValue' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "O campo deve ser preenchido!")
    @CPF(message = "'${validatedValue}' é invalido!")
    private String cpf;

    @NotEmpty(message = "O campo deve ser preenchido!")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;

    @NotNull(message = "Preencha o campo corretamente.")
    @Past(message = "Data '${validatedValue}' é invalida!")
    private LocalDate dataDeNascimento;
}
