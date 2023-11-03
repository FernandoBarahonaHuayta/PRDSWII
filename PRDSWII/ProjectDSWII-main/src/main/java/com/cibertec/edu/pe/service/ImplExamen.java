package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.modelo.Examen;
import com.cibertec.edu.pe.repository.RepositoryExamen;

@Service
public class ImplExamen implements IServiceExamen{
	@Autowired
	RepositoryExamen exa;
	@Override
	public List<Examen> Listar() {
		return (List<Examen>) exa.findAll();
		
	}

	@Override
	public Examen Agregar(Examen examen) {
		// TODO Auto-generated method stub
		return exa.save(examen);
	}

	@Override
	public Examen Actualizar(Examen examen) {
		// TODO Auto-generated method stub
		return exa.save(examen);
	}

	@Override
	public Examen Buscar(Long id) {
		// TODO Auto-generated method stub
		return exa.findById(id).orElse(null);
	}

	@Override
	public boolean Eliminar(Long id) {
		boolean exito = false;
		try {
			exa.deleteById(id);
			exito = true;
		} catch (Exception e) {
			exito = false;
		}
		return exito;
	}

}
