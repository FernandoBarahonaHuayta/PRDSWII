package com.cibertec.edu.pe.service;

import java.util.List;

import com.cibertec.edu.pe.modelo.Pregunta;
import com.cibertec.edu.pe.modelo.Rol;

public interface IServiceRol {

public List<Rol> Listar();
	
	public Rol Agregar(Rol rl);
	
	public Rol Actualizar(Rol rl);
	
	public Rol Buscar(Long id);
	
	public boolean Eliminar(Long id);
	
}
