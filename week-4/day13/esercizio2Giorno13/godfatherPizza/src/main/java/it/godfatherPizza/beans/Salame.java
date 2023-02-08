package it.godfatherPizza.beans;

import java.text.DecimalFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Salame extends Pizza{
	DecimalFormat df = new DecimalFormat("0.00##");
	public Salame() {
		nome = "Salame";
		prezzo = 5.99;
		calorie = 1160;
	}
	
	@Override
	public String toString() {
		return String.format("%1$-"+ 20 + "s","Pizza "+getNome()) + String.format("%1$-"+ 10 + "s",this.getCalorie()) + String.format("%1$-"+ 10 + "s",df.format(getPrezzo())+ "€") + prepConto();
	}
	
	public String prepConto() {
		String str = "";
		for (int i=0; i < getTopping().size(); i++ ) {
			str += getTopping().get(i) + " ";
		}
		return str;
	}
	
	@Override
	public String menu() {
		return String.format("%1$-"+ 15 + "s",getNome()) + String.format("%1$-"+ 10 + "s",this.getCalorie()) + String.format("%1$-"+ 10 + "s",this.getPrezzo()+ "€");
	}

}

