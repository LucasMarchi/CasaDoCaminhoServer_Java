package com.casadocaminho.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Item {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Double quantidade;

}
