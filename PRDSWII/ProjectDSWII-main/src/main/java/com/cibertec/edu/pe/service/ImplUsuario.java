package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.modelo.Usuario;
import com.cibertec.edu.pe.repository.RepositoryUsuario;
@Service
public class ImplUsuario implements IServiceUsuario{
	
	@Autowired
	RepositoryUsuario repository;
	@Override
	public List<Usuario> Listar() {
		// TODO Auto-generated method stub
		return (List<Usuario>) repository.findAll();
	}

	@Override
	public Usuario Agregar(Usuario u) {
		return repository.save(u);
	}

	@Override
	public Usuario Actualizar(Usuario u) {
		return repository.save(u);
	}

	

	@Override
	public boolean Eliminar(Long id) {
		boolean exito = false;
		try {
			repository.deleteById(id);
			exito = true;
		} catch (Exception e) {
			exito = false;
		}
		return exito;
	}

	@Override
	public Usuario Buscar(Usuario id) {
		return repository.findById(id).orElse(null);
	}

}
