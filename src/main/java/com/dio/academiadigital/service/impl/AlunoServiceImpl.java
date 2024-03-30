package com.dio.academiadigital.service.impl;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AlunoForm;
import com.dio.academiadigital.entity.form.AlunoUpdateForm;
import com.dio.academiadigital.repository.AlunoRepository;
import com.dio.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Validated
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;


    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Optional<Aluno> get(Long id){ return repository.findById(id);}

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Aluno> update(Long id, AlunoUpdateForm formUpdate) {
        Aluno aluno = repository.findById(id).get();
        aluno.setBairro(formUpdate.getBairro());
        aluno.setDataDeNascimento(formUpdate.getDataDeNascimento());
        aluno.setNome(formUpdate.getNome());

        return Optional.of(repository.save(aluno));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
