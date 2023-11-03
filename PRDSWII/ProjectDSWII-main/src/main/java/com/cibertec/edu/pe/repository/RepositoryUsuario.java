package com.cibertec.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.edu.pe.modelo.Usuario;

public interface RepositoryUsuario extends JpaRepository<Usuario, Long>{

}
