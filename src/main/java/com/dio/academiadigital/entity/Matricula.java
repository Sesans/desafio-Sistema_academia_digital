package com.dio.academiadigital.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Matricula {
    private Long id;
    private Aluno aluno;
    private LocalDateTime dataDaMatricula = LocalDateTime.now();

}
