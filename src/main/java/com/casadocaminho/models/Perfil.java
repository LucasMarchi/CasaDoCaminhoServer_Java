package com.casadocaminho.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Perfil {
	
	@Id
	@GeneratedValue
	private Long id;
	private String escolaridade;
	private String moradia;
	private String agua;
	private String esgoto;
	private String coletaDeLixo;
	private String banheiroDentro;
	private String chuveiro;
	private String correio;
	private String janelas;
	private String tanque;
	@OneToOne(cascade = CascadeType.ALL)
	private ProblemasFamiliares problemasFamiliares;
	@OneToOne(cascade = CascadeType.ALL)
	private BensFamiliares bensFamiliares;
	@OneToOne(cascade = CascadeType.ALL)
	private DespesasFamiliares despesasFamiliares;
	private String recebeBeneficioPublico;
	private String beneficioPublico;
	private String recebeBeneficioParticular;
	private String beneficioParticular;
	
}
