package cybersoft.javabackend.java14.hibernatejpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{app-id}")
	public ResponseEntity<App> findById(@PathVariable("app-id") String appId) {
		Optional<App> appOpt = Optional.ofNullable(service.findById(appId));
		
		if (appOpt.isPresent()) {
			return new ResponseEntity<App>(appOpt.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<App>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping
	public ResponseEntity<List<App>> findAllApp() {
		List<App> apps = service.findAll();
		
		return new ResponseEntity<List<App>>(apps, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<App> createApp(@RequestBody App app) {
		// validate data -> 
		
		App newApp = service.create(app);
		return new ResponseEntity<App>(newApp, HttpStatus.CREATED);
	}
	
}
