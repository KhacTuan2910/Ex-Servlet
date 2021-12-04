package cybersoft.javabacked.java14.restfulapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabacked.java14.restfulapi.model.Student;
import cybersoft.javabacked.java14.restfulapi.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	private StudentService service;
	
	public StudentController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping("")
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> students = service.getStudents();
		
		return new ResponseEntity<>(students, HttpStatus.NOT_FOUND);
	}
}