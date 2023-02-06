package com.esercizio2Giorno12;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Margherita extends Pizza {

	public Margherita() {
		nome = "Margherita";
		prezzo = 4.99;
		calorie = 1104;
	}
	
	@Override
	public String toString() {
		return this.getNome() + " - Calorie: " + this.getCalorie() + " - Prezzo: " + this.getPrezzo() + "€";
	}
}
