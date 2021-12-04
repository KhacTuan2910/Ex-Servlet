package cybersoft.javabackend.java14.springcrm.entity;

public class Role {
	private String name;
	private String description;
	private int id;
	
	public Role() {
		
	}
	
	public Role(String name, String description, int id) {
		this.name = name;
		this.description = description;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
