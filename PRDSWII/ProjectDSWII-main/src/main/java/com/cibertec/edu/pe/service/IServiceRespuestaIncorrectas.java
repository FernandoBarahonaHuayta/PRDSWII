package com.cibertec.edu.pe.service;

import java.util.List;

import com.cibertec.edu.pe.modelo.RespuestasIncorrectas;
import com.cibertec.edu.pe.repository.RespositoryRespuestaIncorrectas;


public interface IServiceRespuestaIncorrectas {
	public List<RespositoryRespuestaIncorrectas> Listar();
	
	public RespuestasIncorrectas Agregar(RespuestasIncorrectas rs);
	
	public RespuestasIncorrectas Actualizar(RespuestasIncorrectas rs);
	
	public RespuestasIncorrectas Buscar(Long id);
	
	public boolean Eliminar(Long id);

}
