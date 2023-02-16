package it.lorenzoDeCarolis.esercizio1Giorno14.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.lorenzoDeCarolis.esercizio1Giorno14.dao.UserService;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.User;

@Controller
public class AppController {

	@Autowired
	private UserService uService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("/users")
	@ResponseBody
	public ResponseEntity<List<User>> allUsers() {
		List<User> users = uService.getAll();
		if (users.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
		}
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
}
