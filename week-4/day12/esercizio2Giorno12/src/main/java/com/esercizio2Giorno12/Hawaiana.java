package com.esercizio2Giorno12;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Hawaiana extends Pizza {

	public Hawaiana() {
		nome = "Hawaiana";
		prezzo = 6.49;
		calorie = 1024;
	}
	
	@Override
	public String toString() {
		return this.getNome() + " - Calorie: " + this.getCalorie() + " - Prezzo: " + this.getPrezzo() + "€";
	}
	
}
