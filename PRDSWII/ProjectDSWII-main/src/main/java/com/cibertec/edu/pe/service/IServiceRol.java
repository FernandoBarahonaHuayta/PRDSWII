package com.cibertec.edu.pe.service;

import java.util.List;

import com.cibertec.edu.pe.modelo.Pregunta;

public interface IServiceRol {

public List<Pregunta> Listar();
	
	public Pregunta Agregar(Pregunta p);
	
	public Pregunta Actualizar(Pregunta p);
	
	public Pregunta Buscar(Long id);
	
	public boolean Eliminar(Long id);
	
}
