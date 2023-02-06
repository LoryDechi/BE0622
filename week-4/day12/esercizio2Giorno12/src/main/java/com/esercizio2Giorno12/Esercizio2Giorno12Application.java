package com.esercizio2Giorno12;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class Esercizio2Giorno12Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio2Giorno12Application.class, args);
		
		List<Pizza> pizze = preparationP();
		List<Gadget> gadget = preparationG();
		List<Topping> topping = preparationT();
		menu(pizze,gadget,topping);
	}
	
	public static List<Pizza> preparationP() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		List<Pizza> list = new ArrayList<Pizza>();
		Pizza p = (Pizza) ctx.getBean("margherita");
		Hawaiana h = (Hawaiana) ctx.getBean("hawaii");
		Salame s = (Salame) ctx.getBean("salame");
		list.add(s);
		list.add(h);
		list.add(p);
		
		
		((AbstractApplicationContext) ctx).close();
		return list;
	}
	
	public static List<Gadget> preparationG() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		List<Gadget> list = new ArrayList<Gadget>();
		Gadget m = (Gadget) ctx.getBean("maglietta");
		Gadget t = (Gadget) ctx.getBean("tazza");
		list.add(m);
		list.add(t);
		
		
		((AbstractApplicationContext) ctx).close();
		return list;
	}
	
	public static List<Topping> preparationT() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		List<Topping> list = new ArrayList<Topping>();
		Topping c = (Topping) ctx.getBean("cipolla");
		Topping a = (Topping) ctx.getBean("ananas");
		Topping p = (Topping) ctx.getBean("prosciutto");
		Topping m = (Topping) ctx.getBean("mozzarella");
		Topping f = (Topping) ctx.getBean("family");
		list.add(m);
		list.add(p);
		list.add(a);
		list.add(c);
		list.add(f);
		
		
		((AbstractApplicationContext) ctx).close();
		return list;
	}
	
	public static void menu(List<Pizza> p, List<Gadget> g, List<Topping> t) {
		System.out.println("------------------------------------------------");
		System.out.println("BENVENUTO DA GODFATHER'S PIZZA");
		System.out.println("------------------------------------------------");
		System.out.println("----------------Pizze----------------");
		for ( Pizza pi : p) {
			System.out.println(pi);
		}
		
		System.out.println("----------------Toppings----------------");
		for ( Topping top : t) {
			System.out.println(top.menu());
		}
		
		System.out.println("----------------Gadgets----------------");
		for ( Gadget ga : g) {
			System.out.println(ga);
		}
	}

}
