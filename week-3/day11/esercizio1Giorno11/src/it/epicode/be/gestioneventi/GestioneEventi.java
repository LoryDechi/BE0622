package it.epicode.be.gestioneventi;

import java.util.Date;
import java.util.GregorianCalendar;

import it.epicode.be.gestioneventi.model.Concerto;
import it.epicode.be.gestioneventi.model.Evento;
import it.epicode.be.gestioneventi.model.GaraDiAtletica;
import it.epicode.be.gestioneventi.model.Genere;
import it.epicode.be.gestioneventi.model.Location;
import it.epicode.be.gestioneventi.model.Partecipazione;
import it.epicode.be.gestioneventi.model.PartitaDiCalcio;
import it.epicode.be.gestioneventi.model.Persona;
import it.epicode.be.gestioneventi.model.Sesso;
import it.epicode.be.gestioneventi.model.StatoPartecipazione;
import it.epicode.be.gestioneventi.model.TipoEvento;
import it.epicode.be.gestioneventi.model.dao.EventoDAO;
import it.epicode.be.gestioneventi.model.dao.LocationDAO;
import it.epicode.be.gestioneventi.model.dao.PartecipazioneDAO;
import it.epicode.be.gestioneventi.model.dao.PersonaDAO;

public class GestioneEventi {

	public static void main(String[] args) {
		
//		Location location = saveLocation();
//		Evento evento = saveEvento(location);
//		Persona persona = savePersona();
//		GaraDiAtletica gara = saveGara(location,persona);
//		
//		Partecipazione partecipazione = savePartecipazione(evento,persona);
//		
//		PartitaDiCalcio partita = savePartita(location);
//		Concerto concerto = saveConcerto(location);
		
		getConcerto(true);


	}
	
	private static void getConcerto(Boolean b) {
		EventoDAO evDao = new EventoDAO();
		evDao.getConcertiInStreaming(b);
	}
	
	private static Concerto saveConcerto(Location loc) {
		Concerto c = new Concerto();
		c.setDataEvento(new Date());
		c.setTitolo("Maneskin");
		c.setDescrizione("Concerto a Roma");
		c.setNumeroMassimoPartecipanti(10);
		c.setTipoEvento(TipoEvento.PUBBLICO);
		c.setLocation(loc);
		c.setGenere(Genere.ROCK);
		c.setStreaming(true);
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(c);
		return c;
	}
	
	private static GaraDiAtletica saveGara(Location location, Persona persona) {
		GaraDiAtletica g = new GaraDiAtletica();
		g.setDataEvento(new Date());
		g.setTitolo("Partita");
		g.setDescrizione("Finale di Serie A");
		g.setNumeroMassimoPartecipanti(10);
		g.setTipoEvento(TipoEvento.PUBBLICO);
		g.setLocation(location);
		g.setVincitore(persona);
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(g);
		return g;
	}
	
	private static PartitaDiCalcio savePartita(Location loc) {
		PartitaDiCalcio p = new PartitaDiCalcio();
		p.setDataEvento(new Date());
		p.setTitolo("Partita");
		p.setDescrizione("Finale di Serie A");
		p.setNumeroMassimoPartecipanti(10);
		p.setTipoEvento(TipoEvento.PUBBLICO);
		p.setLocation(loc);
		p.setGolCasa(3);
		p.setGolOspiti(2);
		p.setSquadraCasa("Roma");
		p.setSquadraOspite("Lazio");
		p.setSquadraVincente("Roma");
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(p);
		return p;
	}

	
	private static Partecipazione savePartecipazione(Evento evento, Persona persona) {
		Partecipazione part = new Partecipazione();
		part.setEvento(evento);
		part.setPersona(persona);
		part.setStato(StatoPartecipazione.CONFERMATA);
		
		PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();
		partecipazioneDAO.save(part);
		return part;
	}

	private static Persona savePersona() {
		Persona per = new Persona();
		per.setNome("David");
		per.setCognome("Gualberto");
		per.setEmail("ldc@google.com");
		per.setSesso(Sesso.MASCHIO);
		per.setDataDiNascita(new GregorianCalendar(1998,6, 6).getTime());
		PersonaDAO personaDAO = new PersonaDAO();
		personaDAO.save(per);
		return per;
	}

	private static Location saveLocation() {
		Location loc = new Location();
		loc.setCitta("Roma");
		loc.setNome("Circo Massimo");
		
		LocationDAO locationDAO = new LocationDAO();
		locationDAO.save(loc);
		return loc;
	}

	private static Evento saveEvento(Location loc) {
		Evento ev = new Evento();
		ev.setDataEvento(new Date());
		ev.setTitolo("Partita");
		ev.setDescrizione("Finale di Serie A");
		ev.setNumeroMassimoPartecipanti(10);
		ev.setTipoEvento(TipoEvento.PUBBLICO);
		ev.setLocation(loc);
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);
		return ev;
	}

}
