package it.epicode.be.gestioneventi.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gara_di_atletica")
@Getter
@Setter
@NoArgsConstructor
public class GaraDiAtletica extends Evento {
	
	@OneToMany(mappedBy = "evento", cascade = CascadeType.REMOVE)
	private Set<Partecipazione> setAtleti;
	
	@OneToOne
	private Persona vincitore;

	public GaraDiAtletica(Long id, String titolo, Date dataEvento, String descrizione, TipoEvento tipoEvento,
			Integer numeroMassimoPartecipanti, Set<Partecipazione> setPartecipazioni, Location location,
			Persona vincitore) {
		super(id, titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, setPartecipazioni, location);
		this.vincitore = vincitore;
	}
	
	
	
}
