package com.casadocaminho.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	private boolean coletaDeLixo;
	private boolean banheiroDentro;
	private boolean chuveiro;
	private boolean correio;
	private boolean janelas;
	private boolean tanque;
	
}
