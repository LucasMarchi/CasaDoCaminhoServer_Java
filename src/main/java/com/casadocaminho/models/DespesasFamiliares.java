package com.casadocaminho.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DespesasFamiliares {
	
	@Id
	@GeneratedValue
	private Long id;
	private boolean aluguel;
    private boolean prestacaoCasa;
    private boolean alimentacao;
    private boolean remedios;
    private boolean roupas;
    private boolean calcados;	
    private boolean transportePublico;
    private boolean combustivel;
    private boolean mensalidadeEscolar;
    private boolean convenioMedico;
    private boolean academia;
    private boolean cursosLinguas;	
    private boolean tvPaga;
    private boolean internet;
    private boolean outros;	

}
