package com.dio.academiadigital.controller;

import com.dio.academiadigital.entity.Matricula;
import com.dio.academiadigital.entity.form.MatriculaForm;
import com.dio.academiadigital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@RequestBody MatriculaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false)String bairro){
        return service.getAll(bairro);
    }
}
