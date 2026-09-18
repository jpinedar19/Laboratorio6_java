package com.biblioteca.ejercicio4.service;

import com.biblioteca.ejercicio4.model.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibroService {
    private final List<Libro> libros = new ArrayList<>();
    private Long secuencialId = 1L;

    public List<Libro> obtenerTodos() {
        return libros;
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        return libros.stream()
                .filter(l -> l.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Optional<Libro> obtenerPorId(Long id) {
        return libros.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst();
    }

    public Libro guardar(Libro libro) {
        libro.setId(secuencialId++);
        libros.add(libro);
        return libro;
    }

    public Optional<Libro> actualizar(Long id, Libro libroActualizado) {
        return obtenerPorId(id).map(libroExistente -> {
            libroExistente.setTitulo(libroActualizado.getTitulo());
            libroExistente.setAutor(libroActualizado.getAutor());
            libroExistente.setIsbn(libroActualizado.getIsbn());
            libroExistente.setAnioPublicacion(libroActualizado.getAnioPublicacion());
            libroExistente.setEstado(libroActualizado.getEstado());
            return libroExistente;
        });
    }

    public boolean eliminar(Long id) {
        return libros.removeIf(l -> l.getId().equals(id));
    }
}