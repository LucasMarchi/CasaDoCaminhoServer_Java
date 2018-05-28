package com.casadocaminho.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Doacao {
	
	@Id
	@GeneratedValue
	private Long id;
	@OneToOne
	@JoinColumn(name = "doador_id")
	private Doador doador;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Item> itens;

}
