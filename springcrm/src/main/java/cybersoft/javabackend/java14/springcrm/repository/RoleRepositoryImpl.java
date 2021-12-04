package cybersoft.javabackend.java14.springcrm.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cybersoft.javabackend.java14.springcrm.entity.Role;

@Component
public class RoleRepositoryImpl implements RoleRepository {
	private List<Role> roles;
	
	public RoleRepositoryImpl() {
		roles = new ArrayList<Role>();
		roles.add(new Role("ADMIN", "Administrators", 1));
		roles.add(new Role("USER", "Normal User", 2));
	}
	
	@Override
	public List<Role> getRoles() {
		return this.roles;
	}
}
