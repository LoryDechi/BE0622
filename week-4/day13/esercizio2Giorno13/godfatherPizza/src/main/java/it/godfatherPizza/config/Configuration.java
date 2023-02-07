package it.godfatherPizza.config;

import java.time.LocalTime;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import it.godfatherPizza.beans.Ananas;
import it.godfatherPizza.beans.Bibita;
import it.godfatherPizza.beans.Cipolla;
import it.godfatherPizza.beans.FamilySize;
import it.godfatherPizza.beans.Gadget;
import it.godfatherPizza.beans.Hawaiana;
import it.godfatherPizza.beans.Margherita;
import it.godfatherPizza.beans.Mozzarella;
import it.godfatherPizza.beans.Ordine;
import it.godfatherPizza.beans.Pizza;
import it.godfatherPizza.beans.Prodotto;
import it.godfatherPizza.beans.Prosciutto;
import it.godfatherPizza.beans.Salame;
import it.godfatherPizza.beans.Tavolo;
import it.godfatherPizza.beans.Topping;
import it.godfatherPizza.enums.Stato;
import it.godfatherPizza.enums.StatoOrdine;

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
	
	//BIBITE
	@Bean
	@Scope("prototype")
	public Bibita limonata() {
		return new Bibita("Limonata", 1.29,128);
	}
	
	@Bean
	@Scope("prototype")
	public Bibita acqua() {
		return new Bibita("Acqua", 1.29,0);
	}
	
	@Bean
	@Scope("prototype")
	public Bibita vino() {
		return new Bibita("Vino", 7.49,607);
	}

	
	//ORDINE E TAVOLO
	
	@Bean
	@Scope("prototype")
	public Tavolo tavolo(int n, int c, Stato s) {
		return new Tavolo(n,c,s);
	}
	
	@Bean
	@Scope("prototype")
	public Ordine ordine(int n, Tavolo t, int nc, List<Prodotto> l, StatoOrdine so, LocalTime time) {
		return new Ordine(n,t,nc,l,so,time);
	}
	
}
