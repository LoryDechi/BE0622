package it.lorenzoDeCarolis.gestioneDispositivi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.lorenzoDeCarolis.gestioneDispositivi.models.Dispositivo;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, Integer> {

}
