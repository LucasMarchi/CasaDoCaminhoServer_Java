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

import com.casadocaminho.models.Doador;
import com.casadocaminho.repositories.DoadorRepository;

@RestController
@RequestMapping("/doadores")
public class DoadorController {

	@Autowired
	private DoadorRepository doadorRepository;

	@GetMapping
	public List<Doador> listarTodos() {
		return doadorRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Doador> getDoador(@PathVariable("id") Long id) {
		return doadorRepository.findById(id);
	}

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody Doador doador) {
		doadorRepository.save(doador);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> atualizar(@RequestBody Doador doador) {
		doadorRepository.save(doador);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
		 doadorRepository.deleteById(id);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
}
