package it.godfatherPizza.beans;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import it.godfatherPizza.enums.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@PropertySource("classpath:application.properties")
@ToString
public class Ordine {
	
	private int numeroOrdine;
	private Tavolo tavolo;
	private int numeroCoperti;
	private List<Prodotto> elementi;
	private StatoOrdine stato;
	private LocalTime orarioOrdine;
	
	@Value("${ordine.costoCoperto}")
	private int costoCoperto;
	
	public Ordine(int numeroOrdine, Tavolo tavolo, int numeroCoperti, List<Prodotto> elementi, StatoOrdine stato,
			LocalTime orarioOrdine) {
		this.numeroOrdine = numeroOrdine;
		this.tavolo = tavolo;
		this.numeroCoperti = numeroCoperti;
		this.elementi = elementi;
		this.stato = stato;
		this.orarioOrdine = orarioOrdine;
	}

	public double getTotale() {
		double tot = this.numeroCoperti;
		
		for (int i = 0; i< this.elementi.size(); i++) {
			tot += this.elementi.get(i).prezzo;
		}
		
		return tot;
		
	}



	

}
