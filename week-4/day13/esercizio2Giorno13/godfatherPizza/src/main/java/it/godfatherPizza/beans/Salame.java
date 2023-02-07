package it.godfatherPizza.beans;

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
		return String.format("%1$-"+ 15 + "s",getNome()) + String.format("%1$-"+ 10 + "s",this.getCalorie()) + String.format("%1$-"+ 10 + "s",this.getPrezzo()+ "€");
	}

}

