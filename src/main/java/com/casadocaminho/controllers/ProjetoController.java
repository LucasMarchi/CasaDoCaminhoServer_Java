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
import com.casadocaminho.models.Doador;
import com.casadocaminho.models.Projeto;
import com.casadocaminho.models.Voluntario;
import com.casadocaminho.repositories.BeneficiarioRepository;
import com.casadocaminho.repositories.DoadorRepository;
import com.casadocaminho.repositories.ProjetoRepository;
import com.casadocaminho.repositories.VoluntarioRepository;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

	@Autowired
	private ProjetoRepository projetoRepository;
	
	@Autowired
	private VoluntarioRepository voluntarioRepository;
	
	@Autowired
	private BeneficiarioRepository beneficiarioRepository;
	
	@Autowired
	private DoadorRepository doadorRepository;

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
	
	@GetMapping("/{id}/voluntarios/naoassociados")
	public List<Voluntario> listarVoluntariosNaoAssociadosPorProjeto(@PathVariable("id") Long id) {
		Optional<Projeto> projeto = projetoRepository.findById(id);
		List<Voluntario> voluntarios = voluntarioRepository.findAll();
		voluntarios.removeIf(voluntario -> projeto.get().getVoluntarios().contains(voluntario));
		return voluntarios;
	}
	
	@GetMapping("/{id}/beneficiarios/naoassociados")
	public List<Beneficiario> listarBeneficiariosNaoAssociadosPorProjeto(@PathVariable("id") Long id) {
		Optional<Projeto> projeto = projetoRepository.findById(id);
		List<Beneficiario> beneficiarios = beneficiarioRepository.findAll();
		beneficiarios.removeIf(beneficiario -> projeto.get().getBeneficiarios().contains(beneficiario));
		return beneficiarios;
	}
	
	@GetMapping("/{id}/doadores/naoassociados")
	public List<Doador> listarDoadoresNaoAssociadosPorProjeto(@PathVariable("id") Long id) {
		Optional<Projeto> projeto = projetoRepository.findById(id);
		List<Doador> doadores = doadorRepository.findAll();
		doadores.removeIf(doador -> projeto.get().getDoadores().contains(doador));
		return doadores;
	}
}
