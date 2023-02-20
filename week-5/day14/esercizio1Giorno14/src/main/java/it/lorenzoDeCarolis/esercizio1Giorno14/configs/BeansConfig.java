package it.lorenzoDeCarolis.esercizio1Giorno14.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Building;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Role;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.RoleType;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.User;

@Configuration
public class BeansConfig {

	@Bean
	@Scope("prototype")
	public User user(String fullname, String username, String password) {
		return User.builder()
				.fullname(fullname)
				.username(username)
				.password(password)
				.active(true)
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Role role(RoleType rt) {
		return Role.builder()
				.type(rt)
				.build();
	}
	
	
	@Bean
	@Scope("prototype")
	public Building building(String n, String a,String c) {
		return Building.builder()
				.name(n)
				.address(a)
				.city(c)
				.build();
	}
}
