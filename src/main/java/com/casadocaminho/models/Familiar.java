package com.casadocaminho.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Familiar {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String parentesco;
	private String escolaridade;
	private String convenio;
	private String ocupacao;
	private BigDecimal rendaMensal;	

}
