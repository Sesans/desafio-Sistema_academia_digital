package com.dio.academiadigital.service;

import com.dio.academiadigital.entity.Matricula;
import com.dio.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll(String bairro);

    void delete(Long id);
}
