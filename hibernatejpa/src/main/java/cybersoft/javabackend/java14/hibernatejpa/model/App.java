package cybersoft.javabackend.java14.hibernatejpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class App {
	@Id
	private String id;
	private String name;
	private String description;
	// private Author author;
	
	public App() {
		// TODO Auto-generated constructor stub
	}
	public App(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
