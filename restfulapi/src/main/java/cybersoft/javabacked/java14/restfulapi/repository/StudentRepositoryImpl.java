package cybersoft.javabacked.java14.restfulapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cybersoft.javabacked.java14.restfulapi.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	private List<Student> students;
	
	public StudentRepositoryImpl() {
		students = new ArrayList<>();
		students.add(new Student("SV001", "Trịnh Hoàng Tuấn", 1988));
		students.add(new Student("SV002", "Vương Thiên Nhất", 1989));
		students.add(new Student("SV003", "Trịnh Duy Đồng", 1993));
		students.add(new Student("SV004", "Triệu Hâm Hâm", 1990));
	}

	@Override
	public List<Student> getStudents() {
		return this.students;
	}
}
