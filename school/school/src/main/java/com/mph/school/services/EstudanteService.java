package com.bn.school.services;

import com.bn.school.models.Estudante;
import com.bn.school.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public Estudante criarEstudante(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    public List<Estudante> buscarTodos() {
        return estudanteRepository.findAll();
    }

    public Estudante buscarPorId(Long id) {
        return estudanteRepository.findById(id).orElse(null);
    }

    public void deletarEstudante(Long id) {
        estudanteRepository.deleteById(id);
    }
}