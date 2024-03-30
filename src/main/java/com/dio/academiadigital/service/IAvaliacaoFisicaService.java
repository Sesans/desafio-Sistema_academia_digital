package com.dio.academiadigital.service;

import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    List<AvaliacaoFisica> getAll();

    List<AvaliacaoFisica> get(Long id);

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
