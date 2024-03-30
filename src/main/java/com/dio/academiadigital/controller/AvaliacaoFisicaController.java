package com.dio.academiadigital.controller;

import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.dio.academiadigital.service.impl.AvaliacaoFisicaServiceImpl;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public List<AvaliacaoFisica> getOne(@PathVariable Long id){
        return service.get(id);
    }

    @PutMapping
    public AvaliacaoFisica update(@PathVariable Long id,@Valid AvaliacaoFisicaUpdateForm updateForm){
        return service.update(id, updateForm);
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
