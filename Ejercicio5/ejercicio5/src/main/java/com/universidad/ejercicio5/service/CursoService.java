package com.universidad.ejercicio5.service;

import com.universidad.ejercicio5.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CursoService {
    private final List<Curso> cursos = new ArrayList<>();
    private Long secuencialId = 1L;

    public List<Curso> obtenerTodos() {
        return cursos;
    }

    public Optional<Curso> obtenerPorId(Long id) {
        return cursos.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    public List<Curso> buscarPorNombre(String nombre) {
        return cursos.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Curso guardar(Curso curso) {
        curso.setId(secuencialId++);
        cursos.add(curso);
        return curso;
    }

    public Optional<Curso> actualizar(Long id, Curso cursoActualizado) {
        return obtenerPorId(id).map(c -> {
            c.setCodigo(cursoActualizado.getCodigo());
            c.setNombre(cursoActualizado.getNombre());
            c.setCreditos(cursoActualizado.getCreditos());
            c.setPrerrequisitos(cursoActualizado.getPrerrequisitos());
            return c;
        });
    }

    public boolean eliminar(Long id) {
        return cursos.removeIf(c -> c.getId().equals(id));
    }
}