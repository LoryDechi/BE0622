package it.lorenzoDeCarolis.esercizio1Giorno14.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Building;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Role;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAll(){
		return userRepo.findAll();
	}
	
	public Optional<User> getById(int id){
		return userRepo.findById(id);
	}
	
	public void delete(int id) {
		Optional<User> user = getById(id);
		if(user.isPresent()) {
			User userObj = user.get();
			userRepo.delete(userObj);
			System.out.println("Utente con id " + id + " eliminato con successo.");
		} else {
			System.out.println("Utente con id " + id + " non trovato.");
		}
	}
	
	public void delete(User u) {
		userRepo.delete(u);
	}
	
	public User save(User u) {
		return userRepo.save(u);
	}
	
}
