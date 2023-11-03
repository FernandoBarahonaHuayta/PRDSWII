package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.modelo.Seccion;
import com.cibertec.edu.pe.modelo.Ubigeo;
import com.cibertec.edu.pe.repository.RepositoryUbigeo;
@Service
public class ImplUbigeo implements IServiceUbigeo{
	@Autowired
	RepositoryUbigeo repository;
	@Override
	public List<Ubigeo> Listar() {
			return (List<Ubigeo>) repository.findAll(); 
					}

	@Override
	public Ubigeo Agregar(Ubigeo u) {
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
	public Ubigeo Actualizar(Ubigeo u) {
		return repository.save(u);
	}

	@Override
	public Ubigeo Buscar(Long id) {
		return repository.findById(id).orElse(null);
	}

}
