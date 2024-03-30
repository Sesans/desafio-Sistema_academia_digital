package com.dio.academiadigital.entity.form;

import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AlunoForm extends AlunoUpdateForm{

    @NotEmpty(message = "O campo deve ser preenchido!")
    @CPF(message = "'${validatedValue}' é invalido!")
    private String cpf;
}
