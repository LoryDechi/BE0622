package it.epicode.be.gestioneventi.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "concerto")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Concerto extends Evento {

	@Enumerated(EnumType.STRING)
	private Genere genere;
	
	private boolean streaming;
	
}
