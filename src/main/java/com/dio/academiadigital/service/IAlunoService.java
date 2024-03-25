package com.dio.academiadigital.service;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AlunoForm;
import com.dio.academiadigital.entity.form.AlunoUpdateForm;
import java.util.List;
import java.util.Optional;

public interface IAlunoService {
    Aluno create(AlunoForm form);

    Optional<Aluno> get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvalicaoFisicaid(Long id);
}
