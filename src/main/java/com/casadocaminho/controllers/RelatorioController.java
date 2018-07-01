package com.casadocaminho.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casadocaminho.models.Familiar;
import com.casadocaminho.repositories.FamiliarRepository;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

	@Autowired
	private FamiliarRepository familiarRepository;

	@GetMapping("/familiar/{idade}/{tamanhoCalcado}")
	public List<Familiar> getFamiliar(@PathVariable("idade") Long idade, @PathVariable("tamanhoCalcado") Long tamanhoCalcado) {
		return familiarRepository.findByIdadeAndTamanhoCalcado(idade, tamanhoCalcado);
	}

}
