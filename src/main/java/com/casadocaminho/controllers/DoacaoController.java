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

import com.casadocaminho.models.Doacao;
import com.casadocaminho.repositories.DoacaoRepository;

@RestController
@RequestMapping("/doacoes")
public class DoacaoController {

	@Autowired
	private DoacaoRepository doacaoRepository;

	@GetMapping
	public List<Doacao> listarTodos() {
		return doacaoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Doacao> getDoacao(@PathVariable("id") Long id) {
		return doacaoRepository.findById(id);
	}

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody Doacao doacao) {
		doacaoRepository.save(doacao);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> atualizar(@RequestBody Doacao doacao) {
		doacaoRepository.save(doacao);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
		 doacaoRepository.deleteById(id);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
}
