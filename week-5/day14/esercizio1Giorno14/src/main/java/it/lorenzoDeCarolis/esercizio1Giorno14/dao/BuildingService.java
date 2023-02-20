package it.lorenzoDeCarolis.esercizio1Giorno14.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Building;

@Service
public class BuildingService {

	
	@Autowired
	private BuildingRepository bRepo;
	
	public Building save(Building b) {
		return bRepo.save(b);
	}
}
