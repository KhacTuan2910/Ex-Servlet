package cybersoft.javabackend.java14.hibernatejpa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java14.hibernatejpa.model.Author;

@RestController
@RequestMapping("/authors")
public class AuthorController {
	private 
	
	@GetMapping
	public ResponseEntity<List<Author>> findAuthorByEmail(
				@RequestParam(value = "email", defaultValue = "",
				required = false) String email) {
		List<Author> authors;
		if ("".equals(email)) {
			authors = service.findAll();
		} else {
			authors = service.findByEmail();
		}
		return new ResponseEntity(authors, HttpStatus.OK);
	}
	
	@PostMapping
}
