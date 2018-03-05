package com.casadocaminho.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casadocaminho.models.Voluntario;
import com.casadocaminho.repositories.VoluntarioRepository;

@RestController
public class VoluntarioController {

	@Autowired
	private VoluntarioRepository voluntarioRepository;
	
	@GetMapping
	public List<Voluntario> listar() {
		return voluntarioRepository.findAll();
	}
}
