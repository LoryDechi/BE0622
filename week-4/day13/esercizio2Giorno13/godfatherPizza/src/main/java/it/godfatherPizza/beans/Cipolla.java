package it.godfatherPizza.beans;

import lombok.Getter;

@Getter
public class Cipolla extends Topping {
	
	private String condimento;
	private double prezzo;
	private int calorie;
	
	public Cipolla() {
		this.calorie = 22;
		this.prezzo = 0.69;
		this.condimento = "Cipolla";
	}
	
	public Cipolla(Pizza pizza) {
		this.pizza = pizza;
		this.calorie = 22;
		this.prezzo = 0.69;
		this.condimento = "Cipolla";
		setCalorie();
		setPrezzo();
		setCondimento();
	}
	
	@Override
	public String getNome() {
		return pizza.getNome();
	}
	
	@Override
	public void setCondimento() {
		pizza.topping.add(condimento);
	}
	
	@Override
	public void setCalorie() {
		pizza.calorie = pizza.getCalorie() + 22;
	}
	
	@Override
	public void setPrezzo() {
		pizza.prezzo = pizza.getPrezzo() + 0.69;
	}
	
	@Override
	public double getPrezzo() {
		return pizza.getPrezzo();
	}
	
	@Override
	public int getCalorie() {
		return pizza.getCalorie();
	}
	
	@Override
	public String toString() {
		return this.getNome() + " - Calorie: " + this.getCalorie() + " - Prezzo: " + this.getPrezzo() + "€";
	}

	@Override
	public String menu() {
		return String.format("%1$-"+ 15 + "s",this.condimento) + String.format("%1$-"+ 10 + "s",this.calorie) + String.format("%1$-"+ 10 + "s",this.prezzo+ "€");
	}
}
