package com.api.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.java.DTO.UsuarioDTO;
import com.api.java.model.Usuario;
import com.api.java.service.UsuarioService;

@RestController
@RequestMapping("/users")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> listar(){
		return usuarioService.listaUsuarios();
	}

	@PostMapping
	public Usuario inserir(@RequestBody UsuarioDTO usuarioDTO) {
		return usuarioService.insereUsuarios(usuarioDTO);
		
	}
	
}
