package cybersoft.javabacked.java14.restfulapistudent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabacked.java14.restfulapistudent.model.Student;
import cybersoft.javabacked.java14.restfulapistudent.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	private StudentService service;
	
	public StudentController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping("")
	public Object getStudent() {	
		return service.getStudents();
	}
	
	@GetMapping("add-by-param")
	public Object getStudentsByParam(@RequestParam(required = false) String name, 
								@RequestParam(required = false) String age) {
		if(name != null && age != null)
			service.addStudent(name, age);		
		return service.getStudents();
	}
	
	@GetMapping("add-by-path/{name}/{age}")
	public Object view(@PathVariable() String name, 
			@PathVariable() String age) {
		if(name != null && age != null)
			service.addStudent(name, age);
		return service.getStudents();
	}
	
	@PostMapping("add-by-reqbody")
	public Object getStudentsByReqBody(@RequestBody Student student) {
		String name = student.getName();
		String age = student.getAge() + "";
		service.addStudent(name, age);
		return service.getStudents();
	}
}
