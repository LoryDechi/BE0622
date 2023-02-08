package it.godfatherPizza;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import it.godfatherPizza.beans.Bibita;
import it.godfatherPizza.beans.Gadget;
import it.godfatherPizza.beans.Hawaiana;
import it.godfatherPizza.beans.Ordine;
import it.godfatherPizza.beans.Pizza;
import it.godfatherPizza.beans.Prodotto;
import it.godfatherPizza.beans.Salame;
import it.godfatherPizza.beans.Tavolo;
import it.godfatherPizza.beans.Topping;
import it.godfatherPizza.config.Configuration;
import it.godfatherPizza.enums.Stato;
import it.godfatherPizza.enums.StatoOrdine;

@SpringBootApplication
public class GodfatherPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodfatherPizzaApplication.class, args);
		List<Pizza> pizze = preparationP();
		List<Gadget> gadget = preparationG();
		List<Topping> topping = preparationT();
		List<Bibita> bibite = preparationB();
		menu(pizze, gadget, topping, bibite);
		ordinazione();
	}

	public static List<Pizza> preparationP() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		List<Pizza> list = new ArrayList<Pizza>();
		Pizza p = (Pizza) ctx.getBean("margherita");
		Hawaiana h = (Hawaiana) ctx.getBean("hawaiana");
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

	public static List<Bibita> preparationB() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		List<Bibita> list = new ArrayList<Bibita>();
		Bibita l = (Bibita) ctx.getBean("limonata");
		Bibita a = (Bibita) ctx.getBean("acqua");
		Bibita v = (Bibita) ctx.getBean("vino");

		list.add(l);
		list.add(v);
		list.add(a);

		((AbstractApplicationContext) ctx).close();
		return list;
	}

	public static void menu(List<Pizza> p, List<Gadget> g, List<Topping> t, List<Bibita> b) {
		System.out.println("------------------------------------------------");
		System.out.println("BENVENUTO DA GODFATHER'S PIZZA");
		System.out.println("------------------------------------------------");
		System.out.println("----------------Pizze----------------");
		System.out.println(String.format("%1$-" + 15 + "s", "Nome") + String.format("%1$-" + 10 + "s", "Calorie")
				+ String.format("%1$-" + 10 + "s", "Prezzo"));
		for (Pizza pi : p) {
			System.out.println(pi.menu());
		}

		System.out.println("----------------Toppings----------------");
		System.out.println(String.format("%1$-" + 15 + "s", "Nome") + String.format("%1$-" + 10 + "s", "Calorie")
				+ String.format("%1$-" + 10 + "s", "Prezzo"));
		for (Topping top : t) {
			System.out.println(top.menu());
		}

		System.out.println("----------------Bibite----------------");
		System.out.println(String.format("%1$-" + 15 + "s", "Nome") + String.format("%1$-" + 10 + "s", "Calorie")
				+ String.format("%1$-" + 10 + "s", "Prezzo"));
		for (Bibita bi : b) {
			System.out.println(bi);
		}

		System.out.println("----------------Gadgets----------------");
		System.out.println(String.format("%1$-" + 25 + "s", "Nome") + String.format("%1$-" + 10 + "s", "Prezzo"));
		for (Gadget ga : g) {
			System.out.println(ga);
		}
	}

	public static void ordinazione() {
		DecimalFormat df = new DecimalFormat("0.00##");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext();
		ctx2.scan("it.godfatherPizza.beans");
		ctx2.refresh();
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int ran = random.nextInt(1000);

		Tavolo t = (Tavolo) ctx.getBean("tavolo", ran, 6, Stato.OCCUPATO);

		System.out.println("Benvenuti! In quanti volete ordinare?:");
		int numeroC = Integer.parseInt(input.nextLine());

		List<Prodotto> listaProdotti = new ArrayList<Prodotto>();
		int scelta = 0;
		do {
			System.out.println("Digita il nome della pizza da ordinare del cliente " + (scelta + 1) + " :");
			String prod = input.nextLine();
			Pizza pr = (Pizza) ctx.getBean(prod);

			int risp;
			do {
				System.out.println("Desideri aggiungere un Topping alla tua pizza?");
				System.out.println("1)SI");
				System.out.println("2)NO");
				risp = Integer.parseInt(input.nextLine());

				switch (risp) {
				case 1:
					System.out.println("Inserisci il nome del topping da aggiungere:");
					String top = input.nextLine()+"T";
					Topping topping = (Topping) ctx.getBean(top,pr);
					
					break;
				case 2:
					risp = 2;
					break;
				}

			} while (risp != 2);

			System.out.println("Desideri aggiungere una nota?");
			System.out.println("1)SI");
			System.out.println("2)NO");
			int ris = Integer.parseInt(input.nextLine());
			if (ris == 1) {
				System.out.println("Inserisci la nota da aggiungere:");
				String nota = input.nextLine();
				pr.setNota(nota);
			}
			listaProdotti.add(pr);
			scelta++;
		} while (scelta != numeroC);

		int risposta;
		do {
			System.out.println("Volete ordinare altro?");
			System.out.println("1)SI");
			System.out.println("2)NO");
			risposta = Integer.parseInt(input.nextLine());

			switch (risposta) {
			case 1:
				System.out.println("Digita il nome del prodotto da ordinare:");
				String prod = input.nextLine();
				Prodotto pr = (Prodotto) ctx.getBean(prod);
				listaProdotti.add(pr);
				break;
			case 2:
				risposta = 2;
				break;
			}

		} while (risposta != 2);

		Ordine ordine = (Ordine) ctx2.getBean("ordine", ran, t, numeroC, listaProdotti, StatoOrdine.IN_CORSO,
				LocalTime.now());

		System.out.println("Il vostro ordine n°: " + ordine.getNumeroOrdine()
				+ " è in preparazione. Il costo totale del vostro ordine è: " + df.format(ordine.getTotale())
				+ "€ e contiene i seguenti prodotti:");
		System.out.println(String.format("%1$-" + 20 + "s", "Nome") + String.format("%1$-" + 10 + "s", "Calorie")
		+ String.format("%1$-" + 10 + "s", "Prezzo") + "Extra");
		for (Prodotto p : ordine.getElementi()) {
			System.out.println(p);
		}

		input.close();
		((AbstractApplicationContext) ctx).close();
		((AbstractApplicationContext) ctx2).close();
	}
}
