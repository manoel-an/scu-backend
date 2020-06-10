package com.mctic.scuapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.mctic.scuapi.model.Usuario;
import com.mctic.scuapi.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario atualizar(Long codigo, Usuario usuario) {
		  Usuario usuarioSalvo = this.usuarioRepository.findById(codigo)
			      .orElseThrow(() -> new EmptyResultDataAccessException(1));
		BeanUtils.copyProperties(usuario, usuarioSalvo, "codigo");
		return usuarioRepository.save(usuarioSalvo);
	}

}