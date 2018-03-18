package com.casadocaminho.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.casadocaminho.models.Voluntario;
import com.casadocaminho.repositories.VoluntarioRepository;

@RestController
public class VoluntarioController {

	@Autowired
	private VoluntarioRepository voluntarioRepository;
	
	@GetMapping
	public List<Voluntario> listarTodos() {
		return voluntarioRepository.findAll();
	}
	
	@PostMapping(value = "/cadastrar")
	public List<Voluntario> cadastrar(@RequestBody Voluntario voluntario) {
		return voluntarioRepository.findAll();
	}
	
	@PutMapping
	public List<Voluntario> atualizar(@PathVariable Long id) {
		return voluntarioRepository.findAll();
	}
	
	@DeleteMapping
	public List<Voluntario> remover() {
		return voluntarioRepository.findAll();
	}
}
