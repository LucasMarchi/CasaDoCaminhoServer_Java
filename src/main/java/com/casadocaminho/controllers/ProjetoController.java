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

import com.casadocaminho.models.Projeto;
import com.casadocaminho.repositories.ProjetoRepository;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

	@Autowired
	private ProjetoRepository projetoRepository;

	@GetMapping
	public List<Projeto> listarTodos() {
		return projetoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Projeto> getProjeto(@PathVariable("id") Long id) {
		return projetoRepository.findById(id);
	}

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody Projeto projeto) {
		projetoRepository.save(projeto);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> atualizar(@RequestBody Projeto projeto) {
		projetoRepository.save(projeto);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
		 projetoRepository.deleteById(id);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
}
