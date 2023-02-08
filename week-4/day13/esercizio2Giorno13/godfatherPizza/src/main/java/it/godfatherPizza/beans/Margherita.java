package it.godfatherPizza.beans;

import java.text.DecimalFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Margherita extends Pizza {
	DecimalFormat df = new DecimalFormat("0.00##");
	public Margherita() {
		nome = "Margherita";
		prezzo = 4.99;
		calorie = 1104;
	}
	
	@Override
	public String toString() {
		return String.format("%1$-"+ 20 + "s","Pizza "+getNome()) + String.format("%1$-"+ 10 + "s",this.getCalorie()) + String.format("%1$-"+ 10 + "s",df.format(getPrezzo())+ "€") + prepConto();
	}
	
	@Override
	public String menu() {
		return String.format("%1$-"+ 15 + "s",getNome()) + String.format("%1$-"+ 10 + "s",this.getCalorie()) + String.format("%1$-"+ 10 + "s",this.getPrezzo()+ "€");
	}
	
	public String prepConto() {
		String str = "";
		for (int i=0; i<getTopping().size(); i++ ) {
			str += getTopping().get(i) + " ";
		}
		return str;
	}
}
