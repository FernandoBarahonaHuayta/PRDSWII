package com.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.cibertec.edu.pe.modelo.Pregunta;
import com.cibertec.edu.pe.modelo.RespuestasIncorrectas;
import com.cibertec.edu.pe.repository.RepositoryPregunta;
import com.cibertec.edu.pe.repository.RespositoryRespuestaIncorrectas;
@Service
public class ImplPregunta implements IServicePregunta{
	
	@Autowired
	RepositoryPregunta pas;
	@Override
	public List<Pregunta> Listar() {
		return (List<Pregunta>) pas.findAll();
	}

	@Override
	public Pregunta Agregar(Pregunta p) {
		return pas.save(p);
	}

	@Override
	public Pregunta Actualizar(Pregunta p) {
		// TODO Auto-generated method stub
		return pas.save(p);
	}

	@Override
	public Pregunta Buscar(Long id) {
		return pas.findById(id).orElse(null);
	}

	@Override
	public boolean Eliminar(Long id) {
		boolean exito = false;
		try {
			pas.deleteById(id);
			exito = true;
		} catch (Exception e) {
			exito = false;
		}
		return exito;
	}

	

	

}
