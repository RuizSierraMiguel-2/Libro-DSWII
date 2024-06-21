package com.example.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Curso;
import com.example.examen.repository.CursoRepository;


@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoRepository repository;
	
	@Override
	public List<Curso> listaCurso() {
		return repository.findAll();
	}

	@Override
    public Curso listaPorId(int id) {
        return repository.findById(id).get();
    }

	@Override
	public Curso findByIdCurso(int idCurso) {
		return repository.findByIdCurso(idCurso);
	}

	@Override
	public List<Curso> listaCursoPorNombre(String nombre) {
		return repository.listaCursoPorNombre(nombre);
	}
	
}
