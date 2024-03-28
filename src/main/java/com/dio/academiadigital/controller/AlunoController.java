package com.dio.academiadigital.controller;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AlunoForm;
import com.dio.academiadigital.repository.AlunoRepository;
import com.dio.academiadigital.service.impl.AlunoServiceImpl;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Aluno> getOne(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return service.create(form);
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        service.delete(id);
        ResponseEntity.ok("Deletado com sucesso");
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id){
        return service.getAllAvalicaoFisicaid(id);
    }
}