package it.lorenzoDeCarolis.GestionePrenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.lorenzoDeCarolis.GestionePrenotazioni.entity.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer> {

}
