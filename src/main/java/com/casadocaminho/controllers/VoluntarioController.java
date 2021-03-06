package com.casadocaminho.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casadocaminho.models.Voluntario;
import com.casadocaminho.repositories.VoluntarioRepository;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioController {

	@Autowired
	private VoluntarioRepository voluntarioRepository;

	@GetMapping
	public List<Voluntario> listarTodos() {
		return voluntarioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Voluntario> getVoluntario(@PathVariable("id") Long id) {
		return voluntarioRepository.findById(id);
	}

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody Voluntario voluntario) {
		voluntarioRepository.save(voluntario);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> atualizar(@RequestBody Voluntario voluntario) {
		voluntarioRepository.save(voluntario);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
		 voluntarioRepository.deleteById(id);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
}
