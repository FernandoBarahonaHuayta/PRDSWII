package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.modelo.Pregunta;
import com.cibertec.edu.pe.modelo.Rol;
import com.cibertec.edu.pe.repository.RepositoryRol;
@Service
public class ImplRol implements IServiceRol{
	@Autowired
	RepositoryRol repository;
	

	



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
	public List<Rol> Listar() {
		return (List<Rol>) repository.findAll();
	}

	@Override
	public Rol Agregar(Rol rl) {
		return repository.save(rl);
	}

	@Override
	public Rol Actualizar(Rol rl) {
		return repository.save(rl);
	}

	@Override
	public Rol Buscar(Long id) {
	return repository.findById(id).orElse(null);
	}

}
