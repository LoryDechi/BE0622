package it.lorenzoDeCarolis.esercizio1Giorno14.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Integer> {

}
