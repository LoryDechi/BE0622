package com.esercizio2Giorno12;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Salame extends Pizza{
	
	public Salame() {
		nome = "Salame";
		prezzo = 5.99;
		calorie = 1160;
	}
	
	@Override
	public String toString() {
		return this.getNome() + " - Calorie: " + this.getCalorie() + " - Prezzo: " + this.getPrezzo() + "€";
	}

}
