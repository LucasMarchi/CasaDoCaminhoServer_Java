package com.casadocaminho.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Projeto {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String justificativa;
	private String objetivoGeral;
	private String objetivoEspecifico;
	private String metodologia;
	private String publicoAlvo;
	private String recursosCasaDoCaminho;
	private String sustentabilidadeDoProjeto;
	private String cronogramaAtividades;
	private String equpeExecutora;
	//TODO: especifidades do projeto Ex: itens cesta básica

}
