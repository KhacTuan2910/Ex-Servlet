package cybersoft.javabackend.java14.springcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java14.springcrm.entity.Role;
import cybersoft.javabackend.java14.springcrm.service.RoleService;
import cybersoft.javabackend.java14.springcrm.service.RoleServiceImpl;

@RestController
public class RoleController {
	private RoleService service;
	
	public RoleController(RoleService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/roles")
	public List<Role> getRoles(){
		return service.getRoles();
	}
}
