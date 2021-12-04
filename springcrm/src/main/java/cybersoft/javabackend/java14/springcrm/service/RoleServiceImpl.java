package cybersoft.javabackend.java14.springcrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cybersoft.javabackend.java14.springcrm.controller.RoleController;
import cybersoft.javabackend.java14.springcrm.entity.Role;
import cybersoft.javabackend.java14.springcrm.repository.RoleRepository;
import cybersoft.javabackend.java14.springcrm.repository.RoleRepositoryImpl;

@Component
public class RoleServiceImpl implements RoleService {
	private RoleRepository repository;
	
	public RoleServiceImpl(RoleRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Role> getRoles(){
		return repository.getRoles();
	}
}
