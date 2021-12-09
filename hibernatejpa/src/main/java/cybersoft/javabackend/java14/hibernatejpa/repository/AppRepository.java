package cybersoft.javabackend.java14.hibernatejpa.repository;

import java.util.List;

import cybersoft.javabackend.java14.hibernatejpa.model.App;

public interface AppRepository {
	App create(App app);
	
	List<App> findAll();
	
	App findById(String Id);
}
