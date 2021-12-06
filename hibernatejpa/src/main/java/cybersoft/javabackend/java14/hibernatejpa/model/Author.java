package cybersoft.javabackend.java14.hibernatejpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	private String id;
	private String name;
	private String email;
	private String url;
}
