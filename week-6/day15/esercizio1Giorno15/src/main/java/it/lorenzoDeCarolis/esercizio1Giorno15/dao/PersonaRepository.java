package it.lorenzoDeCarolis.esercizio1Giorno15.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.lorenzoDeCarolis.esercizio1Giorno15.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
