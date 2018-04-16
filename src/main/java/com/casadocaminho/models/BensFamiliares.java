package com.casadocaminho.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BensFamiliares {

	@Id
	@GeneratedValue
	private Long id;
	private boolean carro;
    private boolean moto;
    private boolean televisao;
    private boolean dvd;
    private boolean tvPaga;
    private boolean geladeira;
    private boolean lavRoupas;
    private boolean secRoupas;
    private boolean lavLouca;
    private boolean computador;
    private boolean videoGame;
    private boolean internet;	
    private boolean freezer;
    private boolean microondas;
    private boolean apGinastica;
    private boolean outros;
	
}
