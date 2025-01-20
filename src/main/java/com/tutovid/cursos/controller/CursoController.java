package com.tutovid.cursos.controller;

import com.tutovid.cursos.model.Curso;
import com.tutovid.cursos.repository.CursoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/")
    public String listarCursos(Model model) {
    	
    	System.out.println("Ejecutando controlador...");
    	
    	List<Curso> cursos = cursoRepository.findAll();
        
        // Imprime los cursos para ver si se recuperan correctamente
        cursos.forEach(curso -> System.out.println(curso.getNombre() + " - " + curso.getPrecio()));
        
        model.addAttribute("cursos", cursoRepository.findAll());
        
        return "index";
    }
}