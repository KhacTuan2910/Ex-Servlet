package cybersoft.javabacked.java14.restfulapi.model;

public class Student {
	private String mssv;
	private String name;
	private int birthYear;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String mssv, String name, int birthYear) {
		this.mssv = mssv;
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
}
