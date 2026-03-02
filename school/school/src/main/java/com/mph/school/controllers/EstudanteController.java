package com.bn.school.controllers;

import com.bn.school.models.Estudante;
import com.bn.school.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public Estudante criarEstudante(@RequestBody Estudante estudante) {
        return estudanteService.criarEstudante(estudante);
    }

    @GetMapping
    public List<Estudante> buscarTodos() {
        return estudanteService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Estudante buscarPorId(@PathVariable Long id) {
        return estudanteService.buscarPorId(id);
    }
}