package it.lorenzoDeCarolis.esercizio1Giorno14;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.lorenzoDeCarolis.esercizio1Giorno14.configs.BeansConfig;
import it.lorenzoDeCarolis.esercizio1Giorno14.dao.RoleService;
import it.lorenzoDeCarolis.esercizio1Giorno14.dao.UserService;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.Role;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.RoleType;
import it.lorenzoDeCarolis.esercizio1Giorno14.entities.User;



@SpringBootApplication
public class Esercizio1Giorno14Application implements CommandLineRunner {

	
	
	public static void main(String[] args) {
		SpringApplication.run(Esercizio1Giorno14Application.class, args);
	}
	
	@Autowired
	private UserService uServ;
	
	@Autowired
	private RoleService rServ;

	@Override
	public void run(String... args) throws Exception {
//		popolaDB();

	}

	public void popolaDB() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);

		User u1 = (User) ctx.getBean("user", "Lorenzo De Carolis", "dechi", "123456");
		User u2 = (User) ctx.getBean("user", "Mario Rossi", "mRossi", "123456");
		User u3 = (User) ctx.getBean("user", "Marco Neri", "mNeri", "123456");
		User u4 = (User) ctx.getBean("user", "Simone Verdi", "sVerdi", "123456");
		User u5 = (User) ctx.getBean("user", "Giovanni Bianchi", "gBianchi", "123456");
		Role r1 = (Role) ctx.getBean("role", RoleType.ROLE_ADMIN);
		Role r2 = (Role) ctx.getBean("role", RoleType.ROLE_USER);

		u1.setRoles(new HashSet<>() {
			{
				add(r1);
			}
		});
		
		u2.setRoles(new HashSet<>() {
			{
				add(r2);
			}
		});
		
		u3.setRoles(new HashSet<>() {
			{
				add(r2);
			}
		});
		
		u4.setRoles(new HashSet<>() {
			{
				add(r2);
			}
		});
		
		u5.setRoles(new HashSet<>() {
			{
				add(r2);
			}
		});
		
		
		rServ.save(r1);
		rServ.save(r2);
		uServ.save(u1);
		uServ.save(u2);
		uServ.save(u3);
		uServ.save(u4);
		uServ.save(u5);
		
		
		((AnnotationConfigApplicationContext)ctx).close();
	}

}
