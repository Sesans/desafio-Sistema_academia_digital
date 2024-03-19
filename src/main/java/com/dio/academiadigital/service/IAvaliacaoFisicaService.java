package com.dio.academiadigital.service;

import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.Matricula;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.dio.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
