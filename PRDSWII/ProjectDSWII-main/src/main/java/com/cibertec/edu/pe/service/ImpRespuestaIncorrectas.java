package com.cibertec.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.modelo.RespuestasIncorrectas;
import com.cibertec.edu.pe.repository.RespositoryRespuestaIncorrectas;

@Service
public class ImpRespuestaIncorrectas implements IServiceRespuestaIncorrectas{
	@Autowired
	RepositoryRespuestaIncorrectas repository;
	
	@Override
	public List<RespositoryRespuestaIncorrectas> Listar() {
		// TODO Auto-generated method stub
		return (List<RespuestaIncorrectas>) repository.findAll();
	}

	@Override
	public RespuestasIncorrectas Agregar(RespuestasIncorrectas rs) {
		return repository.save(rs);
	}

	@Override
	public RespuestasIncorrectas Actualizar(RespuestasIncorrectas rs) {
		return repository.save(rs);
	}

	@Override
	public RespuestasIncorrectas Buscar(Long id) {
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
