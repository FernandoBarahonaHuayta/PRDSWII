package com.cibertec.edu.pe.service;

import java.util.List;

import com.cibertec.edu.pe.modelo.Curso;

public interface IServiceCurso {
		
	public List<Curso> ListarCurso();
	
	public Curso Agregar(Curso c);
	
	public Curso Actualizar(Curso c);
	
	public Curso BuscarCurso(Long id);
	
	public boolean EliminarCurso(Long id);
}
