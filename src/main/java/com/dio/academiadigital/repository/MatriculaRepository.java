package com.dio.academiadigital.repository;

import com.dio.academiadigital.controller.MatriculaController;
import com.dio.academiadigital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

}
