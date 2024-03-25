package com.dio.academiadigital.service.impl;

import com.dio.academiadigital.entity.Matricula;
import com.dio.academiadigital.entity.form.MatriculaForm;
import com.dio.academiadigital.repository.AlunoRepository;
import com.dio.academiadigital.repository.MatriculaRepository;
import com.dio.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl  implements IMatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        return null;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
