package com.casadocaminho.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Doador {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;

}