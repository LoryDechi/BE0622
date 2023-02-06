package com.esercizio2Giorno12;

public class Mozzarella extends Topping {
	
	private String condimento;
	private double prezzo;
	private int calorie;
	
	public Mozzarella() {
		this.calorie = 92;
		this.prezzo = 0.69;
		this.condimento = "Mozzarella";
	}
	
	public Mozzarella(Pizza pizza) {
		this.pizza = pizza;
		setNome();
		setCalorie();
		setPrezzo();
	}
	
	
	@Override
	public String getNome() {
		return pizza.getNome();
	}
	
	@Override
	public void setNome() {
		pizza.nome = pizza.getNome() + " con extra mozzarella";
	}
	
	@Override
	public void setCalorie() {
		pizza.calorie = pizza.getCalorie() + 92;
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
		return this.condimento + " - Calorie: " + this.calorie + " - Prezzo: " + this.prezzo + "€";
	}
	

}
