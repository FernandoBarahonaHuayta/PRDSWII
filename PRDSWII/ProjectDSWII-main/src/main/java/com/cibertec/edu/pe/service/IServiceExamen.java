package com.cibertec.edu.pe.service;

import java.util.List;


import com.cibertec.edu.pe.modelo.Examen;

public interface IServiceExamen {
	public List<Examen> Listar();
	
	public Examen Agregar(Examen examen);
	
	public Examen Actualizar(Examen examen);
	
	public Examen Buscar(Long id);
	
	public boolean Eliminar(Long id);
}
