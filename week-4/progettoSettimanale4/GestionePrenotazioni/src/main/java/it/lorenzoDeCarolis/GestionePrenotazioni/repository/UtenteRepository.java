package it.lorenzoDeCarolis.GestionePrenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.lorenzoDeCarolis.GestionePrenotazioni.entity.Utente;
@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {

}
