package cybersoft.javabacked.java14.restfulapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
	/* return view */
	
	@GetMapping("")
	public String Welcome(@RequestParam("name") String name) {
		return "welcome " + name;
	}
	
	@GetMapping("/{name}")
//	@RequestMapping(method = RequestMethod.GET, value = "/again")
	public String welcomeName(@PathVariable("name") String name) {
		return "welcome again " + name ;
	}
	
	@GetMapping("/{name}/{year}")
	public String welcomeNameYear(@PathVariable("name") String name,
								@PathVariable("year") int year) {
		return "welcome again " + name + " " + year;
	}
}
