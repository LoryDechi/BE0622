package com.esercizio2Giorno12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pizza {

	protected String nome;
	protected double prezzo;
	protected int calorie;
	
}
