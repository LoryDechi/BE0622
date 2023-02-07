package it.godfatherPizza.beans;

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
		return String.format("%1$-"+ 15 + "s",getNome()) + String.format("%1$-"+ 10 + "s",this.getCalorie()) + String.format("%1$-"+ 10 + "s",this.getPrezzo()+ "€");
	}
}
