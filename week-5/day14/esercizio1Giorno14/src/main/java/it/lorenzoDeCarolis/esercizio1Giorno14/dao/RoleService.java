package it.lorenzoDeCarolis.esercizio1Giorno14.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Role;

@Service
public class RoleService {

	@Autowired
	private RoleRepository rRepo;
	
	public Role save(Role r) {
		return rRepo.save(r);
	}
	
}
