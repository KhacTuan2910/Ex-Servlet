package cybersoft.javabacked.java14.restfulapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javabacked.java14.restfulapi.model.Student;
import cybersoft.javabacked.java14.restfulapi.repository.StudentRepository;

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
}
