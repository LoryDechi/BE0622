package it.lorenzoDeCarolis.esercizio1Giorno14.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import it.lorenzoDeCarolis.esercizio1Giorno14.configs.BeansConfig;
import it.lorenzoDeCarolis.esercizio1Giorno14.dao.BuildingService;
import it.lorenzoDeCarolis.esercizio1Giorno14.dao.RoleService;
import it.lorenzoDeCarolis.esercizio1Giorno14.dao.UserService;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Building;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Role;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.User;

@Controller
public class AppController {

	@Autowired
	private UserService uService;
	
	@Autowired 
	private RoleService rServ;
	
	@Autowired
	private BuildingService bServ;
	
	@Autowired
	PasswordEncoder pwEncoder;
	
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
	
	@PutMapping("/login_success")
	@ResponseBody
	public String login_success() {
		return "login success";
	}
	
	@GetMapping("/add")
	@ResponseBody
	public String addUser() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
		User u = (User)ctx.getBean("user","Pinco Pallino", "pallino", pwEncoder.encode("123456"));
		
		Set<Role> roles = new HashSet<>();
		roles.add( rServ.getById(2).get() );
		u.setRoles(roles);
		
		uService.save(u);
		((AnnotationConfigApplicationContext)ctx).close();
		
		return "Utente aggiunto!";
	}
	
	@GetMapping("/aggiorna_pw")
	@ResponseBody
	public String aggiorna_pw() {
		int id = 3;
		
		User u = uService.getById(id).get();
		String pw = u.getPassword();
		u.setPassword( pwEncoder.encode(pw) );
		uService.save(u);
		
		return "utente aggiornato";
	}
	
	@GetMapping("/addB")
	@ResponseBody
	public String addBuilding() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
		Building b = (Building)ctx.getBean("building","Edificio A", "Via Roma, 5","Roma");
		
		b.setSecretcode("a12d446h");
		
		bServ.save(b);
		
		((AnnotationConfigApplicationContext)ctx).close();
		
		return "Edificio aggiunto!";
	}
	
}
