package com.cibertec.edu.pe.service;

import java.util.List;

import com.cibertec.edu.pe.modelo.Seccion;
import com.cibertec.edu.pe.modelo.Ubigeo;

public interface IServiceUbigeo {
	
	public List<Ubigeo> Listar();
	
	public Ubigeo Agregar(Ubigeo u);
	
	public Ubigeo Actualizar(Ubigeo u);
	
	public Ubigeo Buscar(Long id);
	
	public boolean Eliminar(Long id);
}
