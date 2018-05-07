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

import com.casadocaminho.models.Beneficiario;
import com.casadocaminho.repositories.BeneficiarioRepository;

@RestController
@RequestMapping("/beneficiarios")
public class BeneficiarioController {

	@Autowired
	private BeneficiarioRepository beneficiarioRepository;

	@GetMapping
	public List<Beneficiario> listarTodos() {
		return beneficiarioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Beneficiario> getBeneficiario(@PathVariable("id") Long id) {
		return beneficiarioRepository.findById(id);
	}

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody Beneficiario beneficiario) {
		beneficiarioRepository.save(beneficiario);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> atualizar(@RequestBody Beneficiario beneficiario) {
		Beneficiario beneficiarioPersistido = beneficiarioRepository.save(beneficiario);
		return ResponseEntity.ok().body(beneficiarioPersistido);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
		 beneficiarioRepository.deleteById(id);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
}
