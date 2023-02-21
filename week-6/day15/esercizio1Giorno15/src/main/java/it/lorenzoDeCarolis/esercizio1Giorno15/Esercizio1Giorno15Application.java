package it.lorenzoDeCarolis.esercizio1Giorno15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.lorenzoDeCarolis.esercizio1Giorno15.dao.PersonaService;
import it.lorenzoDeCarolis.esercizio1Giorno15.entities.Persona;

@SpringBootApplication
public class Esercizio1Giorno15Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1Giorno15Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		popolaDB();
		
	}
	
	@Autowired
	private PersonaService serv;
	
	public void popolaDB() {
		
		Persona p1 = Persona.builder()
							.nome("Mario Rossi")
							.username("mRossi")
							.email("m@r.it")
							.build();
		
		Persona p2 = Persona.builder()
				.nome("Marco Neri")
				.username("mNeri")
				.email("m@r.it")
				.build();
		
		Persona p3 = Persona.builder()
				.nome("Giovanni Verdi")
				.username("gVerdi")
				.email("m@r.it")
				.build();
		
		Persona p4 = Persona.builder()
				.nome("Paolo Gialli")
				.username("pGialli")
				.email("m@r.it")
				.build();
		
		Persona p5 = Persona.builder()
				.nome("Simone Bianchi")
				.username("sBianchi")
				.email("m@r.it")
				.build();
		
		Persona p6 = Persona.builder()
				.nome("Luca Rossi")
				.username("lRossi")
				.email("m@r.it")
				.build();
		
		serv.save(p1);
		serv.save(p2);
		serv.save(p3);
		serv.save(p4);
		serv.save(p5);
		serv.save(p6);

	}

}
