package cybersoft.javabacked.java14.restfulapistudent.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cybersoft.javabacked.java14.restfulapistudent.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	private List<Student> students;
	
	public StudentRepositoryImpl() {
		students = new ArrayList<>();
		students.add(new Student("Trịnh Hoàng Tuấn", 32));
		students.add(new Student("Vương Thiên Nhất", 21));
		students.add(new Student("Trịnh Duy Đồng", 22));
		students.add(new Student("Triệu Hâm Hâm", 20));
	}
	
	@Override
	public List<Student> getStudents() {
		return this.students;
	}

	@Override
	public Boolean addStudent(String name, String age) {
		return students.add(new Student(name, Integer.parseInt(age)));
	}
}
