package cybersoft.javabacked.java14.restfulapistudent.service;

import java.util.List;

import cybersoft.javabacked.java14.restfulapistudent.model.Student;

public interface StudentService {
	List<Student> getStudents();
	
	Boolean addStudent(String name, String age);
}
