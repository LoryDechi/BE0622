package it.lorenzoDeCarolis.esercizio2Giorno15.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/os")
public class AppController {

	@GetMapping("/get-string")
	public String getData1() {

		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8082/app/data1";
		ResponseEntity<String> response = rt.getForEntity(rtUrl, String.class);
		return "response: \"" + response.getBody() + "\"";

	}

	@GetMapping("/get-people")
	public String getData3() {

		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8082/app/data3";
		String response = rt.getForObject(rtUrl, String.class);
		return "people list: " + response;

	}

	@GetMapping("/get-people-json")
	public Object getData3JSON() {

		RestTemplate rt = new RestTemplate();
		String rtUrl = "http://localhost:8082/app/data3";
		Object response = rt.getForObject(rtUrl, Object.class);
		return response;

	}
	
	

}
