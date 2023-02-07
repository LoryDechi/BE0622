package it.godfatherPizza.beans;

import it.godfatherPizza.enums.Stato;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {

	private int numero;
	private int numeroCoperti;
	private Stato stato;
	
}
