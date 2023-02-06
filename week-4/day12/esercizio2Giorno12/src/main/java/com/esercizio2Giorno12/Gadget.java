package com.esercizio2Giorno12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Gadget {

	private String nome;
	private double prezzo;
	
	@Override
	public String toString() {
		return this.getNome() + " - Prezzo: " + this.getPrezzo();
	}
	
}
