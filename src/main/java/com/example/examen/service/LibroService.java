package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Libro;

public interface LibroService {

    public abstract List<Libro> listaLibro();
    public abstract List<Libro> listaLibroPorCategoria(String categoria);
    
}
