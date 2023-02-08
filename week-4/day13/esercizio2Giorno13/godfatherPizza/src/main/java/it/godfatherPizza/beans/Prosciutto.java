package it.godfatherPizza.beans;

import lombok.Getter;

@Getter
public class Prosciutto extends Topping {
	
	private String condimento;
	private double prezzo;
	private int calorie;
	
	public Prosciutto() {
		this.calorie = 35;
		this.prezzo = 0.99;
		this.condimento = "Prosciutto";
	}
	
	public Prosciutto(Pizza pizza) {
		this.pizza = pizza;
		this.calorie = 35;
		this.prezzo = 0.99;
		this.condimento = "Prosciutto";
		setCondimento();
		setCalorie();
		setPrezzo();
	}
	
	@Override
	public void setCondimento() {
		pizza.topping.add(condimento);
	}
	
	@Override
	public String getNome() {
		return pizza.getNome();
	}
	
	@Override
	public void setNome() {
		pizza.nome = pizza.getNome() + " con extra Prosciutto";
	}
	
	@Override
	public void setCalorie() {
		pizza.calorie = pizza.getCalorie() + 35;
	}
	
	@Override
	public void setPrezzo() {
		pizza.prezzo = pizza.getPrezzo() + 0.99;
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
