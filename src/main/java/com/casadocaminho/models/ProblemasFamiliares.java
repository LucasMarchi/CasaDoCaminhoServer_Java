package com.casadocaminho.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProblemasFamiliares {
	
	@Id
	@GeneratedValue
	private Long id;
	private boolean alcoolismo;
    private boolean outrasDoencas;
    private boolean morte;
    private boolean abandono;
    private boolean desemprego;
    private boolean subemprego;
    private boolean mudancaEmprego;
    private boolean mudancaMoradia;
    private boolean mudancaCidade;
    private boolean violenciaDomestica;
    private boolean deficienciaFisica;
    private boolean deficienciaMental;

}
