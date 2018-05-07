package com.casadocaminho.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Beneficiario {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Integer idade;
	private String sexo;
	private String cidadeNatal;
	private Integer anoMigracao;
	private String endereco;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private String estadoCivil;
	private Integer quantidadeFilhos;
	private String profisao;
	private String estaTrabalhando;
	private String localTrabalho;
	private String enederecoComercial;
	private String telefoneComercial;
	private String telefoneResidencial;
	private String identidade;
	private String cpf;
	@OneToOne(cascade = CascadeType.ALL)
	private Perfil perfil;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Familiar> familiares;

}
