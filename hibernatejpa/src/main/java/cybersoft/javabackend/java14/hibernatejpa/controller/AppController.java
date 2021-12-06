package cybersoft.javabackend.java14.hibernatejpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java14.hibernatejpa.model.App;
import cybersoft.javabackend.java14.hibernatejpa.service.AppService;

@RestController
@RequestMapping("/apps")
public class AppController {
	/*
	 * Viet api cho phep tao app moi
	 * url: /app
	 * params: App 
	 * return: App
	 * 
	 * yeu cau: tao cac interface, class
	 * service, repository va thuc hien inject cac dependency can thiet
	 */
	private AppService service;
	
	public AppController(AppService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<App> createApp(@RequestBody App app) {
		// validate data -> 
		
		App newApp = service.create(app);
		return new ResponseEntity<App>(newApp, HttpStatus.CREATED);
	}
	
}
