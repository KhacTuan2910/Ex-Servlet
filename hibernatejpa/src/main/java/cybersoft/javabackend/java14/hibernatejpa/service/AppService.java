package cybersoft.javabackend.java14.hibernatejpa.service;

import java.util.List;

import cybersoft.javabackend.java14.hibernatejpa.model.App;

public interface AppService {
	App create(App app);
	
	List<App> findAll();
	
	App findById(String id);
}
