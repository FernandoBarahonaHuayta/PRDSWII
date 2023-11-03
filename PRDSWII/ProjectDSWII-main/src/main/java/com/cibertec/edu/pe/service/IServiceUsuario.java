package com.cibertec.edu.pe.service;

import java.util.List;

import com.cibertec.edu.pe.modelo.Seccion;
import com.cibertec.edu.pe.modelo.Usuario;

public interface IServiceUsuario {
	public List<Usuario> Listar();
	
	public Usuario Agregar(Usuario u);
	
	public Usuario Actualizar(Usuario u);
	
	public Usuario Buscar(Usuario u);
	
	public boolean Eliminar(Long id);
}
