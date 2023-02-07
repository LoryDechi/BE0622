package it.godfatherPizza.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pizza extends Prodotto {

	protected String nome;
	protected int calorie;
	
}
