package com.casadocaminho.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	@OneToMany(cascade = CascadeType.ALL)
	private List<Voluntario> voluntarios;

}
