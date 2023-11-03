package com.cibertec.edu.pe.service;

import java.util.List;

import com.cibertec.edu.pe.modelo.Sede;

public interface IServiceSede {
	
	public List<Sede> Listar();
	
	public Sede Agregar(Sede s);
	
	public Sede Actualizar(Sede s);
	
	public Sede Buscar(Long id);
	
	public boolean Eliminar(Long id);
}
