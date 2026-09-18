package com.universidad.ejercicio5.model;

public class Curso {
    private Long id;
    private String codigo;
    private String nombre;
    private Integer creditos;
    private String prerrequisitos;

    public Curso() {}

    public Curso(Long id, String codigo, String nombre, Integer creditos, String prerrequisitos) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.prerrequisitos = prerrequisitos;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getCreditos() { return creditos; }
    public void setCreditos(Integer creditos) { this.creditos = creditos; }

    public String getPrerrequisitos() { return prerrequisitos; }
    public void setPrerrequisitos(String prerrequisitos) { this.prerrequisitos = prerrequisitos; }
}