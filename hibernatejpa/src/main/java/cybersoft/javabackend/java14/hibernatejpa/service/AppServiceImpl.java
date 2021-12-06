package cybersoft.javabackend.java14.hibernatejpa.service;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.java14.hibernatejpa.model.App;
import cybersoft.javabackend.java14.hibernatejpa.repository.AppRepository;

@Service
public class AppServiceImpl implements AppService {
	private AppRepository repository;
	
	public AppServiceImpl(AppRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public App create(App app) {
		//business
		
		return repository.create(app);
	}

}
