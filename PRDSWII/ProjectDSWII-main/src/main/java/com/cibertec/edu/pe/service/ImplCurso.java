package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.modelo.Curso;
import com.cibertec.edu.pe.repository.RepositoryCurso;
@Service
public class ImplCurso implements IServiceCurso{
	
	@Autowired
	private RepositoryCurso curso;
	@Override
	public List<Curso> ListarCurso() {
		// TODO Auto-generated method stub
		return (List<Curso>) curso.findAll();
	}


	@Override
	public Curso BuscarCurso(Long id) {
			return curso.findById(id).orElse(null);
	}

	@Override
	public boolean EliminarCurso(Long id) {
		boolean exito = false;
		try {
			curso.deleteById(id);
			exito = true;
		} catch (Exception e) {
			exito = false;
		}
		return exito;
	}

	@Override
	public Curso Agregar(Curso c) {
		return curso.save(c);
	}


	@Override
	public Curso Actualizar(Curso c) {
		return curso.save(c);
	}

}
