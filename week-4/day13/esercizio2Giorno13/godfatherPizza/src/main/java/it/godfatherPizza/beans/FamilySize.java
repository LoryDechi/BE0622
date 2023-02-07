package it.godfatherPizza.beans;

public class FamilySize extends Topping {
	
	private String condimento;
	private double prezzo;
	private String calorie;
	
	public FamilySize() {
		this.calorie = "x 2";
		this.prezzo = 4.15;
		this.condimento = "FamilySize";
	}
	
	public FamilySize(Pizza pizza) {
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
		pizza.nome = pizza.getNome() + " in versione famiglia";
	}
	
	@Override
	public void setCalorie() {
		pizza.calorie = pizza.getCalorie() * 2;
	}
	
	@Override
	public void setPrezzo() {
		pizza.prezzo = pizza.getPrezzo() + 4.15;
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
