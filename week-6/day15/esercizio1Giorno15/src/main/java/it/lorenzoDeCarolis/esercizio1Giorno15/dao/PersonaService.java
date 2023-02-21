package it.lorenzoDeCarolis.esercizio1Giorno15.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.lorenzoDeCarolis.esercizio1Giorno15.entities.Persona;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository repo;
	
	public List<Persona> getAll() {
		return repo.findAll();
	}
	
	public Persona save(Persona p) {
		return repo.save(p);
	}
	
}
