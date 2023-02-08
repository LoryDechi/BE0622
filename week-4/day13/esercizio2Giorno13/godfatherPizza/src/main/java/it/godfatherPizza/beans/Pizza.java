package it.godfatherPizza.beans;

import java.util.ArrayList;
import java.util.List;

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
	public List<String> topping = new ArrayList<String>();
	
	public abstract String menu();
	
}
