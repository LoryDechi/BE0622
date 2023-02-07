package it.godfatherPizza.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Gadget extends Prodotto {

	private String nome;
	
	
	@Override
	public String toString() {
		return String.format("%1$-"+ 25 + "s",this.getNome()) + String.format("%1$-"+ 10 + "s",this.getPrezzo()+ "€");
	}


	public Gadget(String nome, double prezzo) {
		super(prezzo);
		this.nome = nome;
	}
	
}
