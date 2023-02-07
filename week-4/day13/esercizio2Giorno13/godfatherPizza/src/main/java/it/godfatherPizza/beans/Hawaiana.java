package it.godfatherPizza.beans;

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
		return String.format("%1$-"+ 15 + "s",getNome()) + String.format("%1$-"+ 10 + "s",this.getCalorie()) + String.format("%1$-"+ 10 + "s",this.getPrezzo()+ "€");
	}
	
}
