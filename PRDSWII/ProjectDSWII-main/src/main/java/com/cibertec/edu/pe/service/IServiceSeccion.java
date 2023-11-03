package com.cibertec.edu.pe.service;

import java.util.List;

import com.cibertec.edu.pe.modelo.Seccion;

public interface IServiceSeccion {

	public List<Seccion> Listar();
	
	public Seccion Agregar(Seccion s);
	
	public Seccion Actualizar(Seccion s);
	
	public Seccion Buscar(Long id);
	
	public boolean Eliminar(Long id);
}
