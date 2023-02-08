package it.godfatherPizza.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bibita extends Prodotto {

	private String nome;
	protected int calorie;
	public Bibita(String nome, double prezzo, int calorie, String nota) {
		super(prezzo,nota);
		this.nome = nome;
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return String.format("%1$-"+ 15 + "s",this.nome) + String.format("%1$-"+ 10 + "s",this.calorie) + String.format("%1$-"+ 10 + "s",this.prezzo+"€");
	}
	
	
}
