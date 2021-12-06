package cybersoft.javabacked.java14.restfulapistudent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javabacked.java14.restfulapistudent.model.Student;
import cybersoft.javabacked.java14.restfulapistudent.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepository repository;
	
	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Student> getStudents() {
		return repository.getStudents();
	}

	@Override
	public Boolean addStudent(String name, String age) {
		return repository.addStudent(name, age);
	}

}
