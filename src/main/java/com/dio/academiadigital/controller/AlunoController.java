package com.dio.academiadigital.controller;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AlunoForm;
import com.dio.academiadigital.entity.form.AlunoUpdateForm;
import com.dio.academiadigital.repository.AlunoRepository;
import com.dio.academiadigital.service.impl.AlunoServiceImpl;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
@CrossOrigin("*")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("/{id}")
    public Optional<Aluno> getOne(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Optional<Aluno> update(@PathVariable Long id, @Valid @RequestBody AlunoUpdateForm formUpdate){
        return service.update(id, formUpdate);
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}