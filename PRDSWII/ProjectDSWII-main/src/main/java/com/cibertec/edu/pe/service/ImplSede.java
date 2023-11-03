package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.modelo.Sede;
import com.cibertec.edu.pe.repository.RepositorySede;
@Service
public class ImplSede implements IServiceSede{
	@Autowired
	RepositorySede repository;
	@Override
	public List<Sede> Listar() {
		return (List<Sede>) repository.findAll();
	}

	@Override
	public Sede Agregar(Sede s) {
		return repository.save(s);
	}

	@Override
	public Sede Actualizar(Sede s) {
		return repository.save(s);
	}

	@Override
	public Sede Buscar(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
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

}
