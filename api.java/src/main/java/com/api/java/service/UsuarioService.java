package com.api.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.java.DTO.UsuarioDTO;
import com.api.java.model.Usuario;
import com.api.java.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
		
	}
	
	public Usuario insereUsuarios(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setNome(usuarioDTO.getUsuario().getNome());
		return usuarioRepository.save(usuario);
		
	}

}
