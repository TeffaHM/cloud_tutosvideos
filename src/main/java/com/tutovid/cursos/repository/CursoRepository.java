package com.tutovid.cursos.repository;

import com.tutovid.cursos.model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	
}
