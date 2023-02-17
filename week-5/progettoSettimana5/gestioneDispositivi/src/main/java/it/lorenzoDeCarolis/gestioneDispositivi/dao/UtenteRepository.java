package it.lorenzoDeCarolis.gestioneDispositivi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.lorenzoDeCarolis.gestioneDispositivi.models.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {

}
