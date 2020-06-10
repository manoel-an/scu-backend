package com.mctic.scuapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mctic.scuapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
