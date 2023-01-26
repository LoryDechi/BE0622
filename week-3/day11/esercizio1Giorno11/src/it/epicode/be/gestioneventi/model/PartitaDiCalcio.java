package it.epicode.be.gestioneventi.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "partita_di_calcio")
@Getter
@Setter
@NoArgsConstructor
public class PartitaDiCalcio extends Evento{

	@Column(name = "squadra_casa")
	private String squadraCasa;
	
	@Column(name = "squadra_ospite")
	private String squadraOspite;
	
	@Column(name = "vincitore")
	private String squadraVincente;
	
	@Column(name = "gol_casa")
	private int golCasa;
	
	@Column(name = "gol_ospiti")
	private int golOspiti;

	public PartitaDiCalcio(Long id, String titolo, Date dataEvento, String descrizione, TipoEvento tipoEvento,
			Integer numeroMassimoPartecipanti, Set<Partecipazione> setPartecipazioni, Location location,
			String squadraCasa, String squadraOspite, String squadraVincente, int golCasa, int golOspiti) {
		super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, setPartecipazioni, location);
		this.squadraCasa = squadraCasa;
		this.squadraOspite = squadraOspite;
		this.squadraVincente = squadraVincente;
		this.golCasa = golCasa;
		this.golOspiti = golOspiti;
	}
	
	
}
