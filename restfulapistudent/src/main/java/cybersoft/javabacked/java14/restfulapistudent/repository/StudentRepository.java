package cybersoft.javabacked.java14.restfulapistudent.repository;

import java.util.List;

import cybersoft.javabacked.java14.restfulapistudent.model.Student;

public interface StudentRepository {
	List<Student> getStudents();
	
	Boolean addStudent(String name, String age);
}
