package com.esercizio2Giorno12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	//GADGETS
	@Bean
	@Scope("prototype")
	public Gadget maglietta() {
		return new Gadget("Maglietta",21.99);
	}
	
	@Bean
	@Scope("prototype")
	public Gadget tazza() {
		return new Gadget("Tazza",4.99);
	}
	
	//PIZZE
	@Bean
	@Scope("prototype")
	public Pizza margherita() {
		return new Margherita();
	}
	
	@Bean
	@Scope("prototype")
	public Pizza hawaii() {
		return new Hawaiana();
	}
	@Bean
	@Scope("prototype")
	public Pizza salame() {
		return new Salame();
	}
	
	
	//TOPPING
	@Bean
	@Scope("prototype")
	public Topping cipolla() {
		return new Cipolla();
	}
	
	@Bean
	@Scope("prototype")
	public Topping ananas() {
		return new Ananas();
	}
	
	@Bean
	@Scope("prototype")
	public Topping prosciutto() {
		return new Prosciutto();
	}
	
	@Bean
	@Scope("prototype")
	public Topping mozzarella() {
		return new Mozzarella();
	}
	
	@Bean
	@Scope("prototype")
	public Topping family() {
		return new FamilySize();
	}
	
	
	
}
