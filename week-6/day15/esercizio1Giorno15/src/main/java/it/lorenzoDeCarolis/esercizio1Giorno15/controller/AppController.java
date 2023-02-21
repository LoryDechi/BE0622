package it.lorenzoDeCarolis.esercizio1Giorno15.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import it.lorenzoDeCarolis.esercizio1Giorno15.dao.PersonaService;
import it.lorenzoDeCarolis.esercizio1Giorno15.entities.Persona;

@RestController
@RequestMapping("/app")
public class AppController {

	@Autowired
	private PersonaService serv;
	
	@GetMapping("/data1")
	public String data1() {
		return "Questa è la Response";
	}
	
	@GetMapping("/data2")
	public ResponseEntity<List<Persona>> prendiPrimiQuattro() {
		List<Persona> persone = serv.getAll();
		List<Persona> persone4 = new ArrayList<>();
		
		if( persone.isEmpty() ) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		for(int i = 0; i<persone.size() && i<4; i++) {
			persone4.add(persone.get(i));
		}
		
		
		return new ResponseEntity<>(persone4, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/data3", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Persona> prendiPrimiQUattroLista() {
		List<Persona> persone = serv.getAll();
		List<Persona> persone4 = new ArrayList<>();
		
		if( persone.isEmpty() ) {
			return persone4;
		}
		
		for(int i = 0; i<persone.size() && i<4; i++) {
			persone4.add(persone.get(i));
		}
		
		
		return persone4;
	}
}
