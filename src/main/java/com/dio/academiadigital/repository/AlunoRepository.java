package com.dio.academiadigital.repository;

import com.dio.academiadigital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //opcional
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
