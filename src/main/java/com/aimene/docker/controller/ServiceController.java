package com.aimene.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	
	
	
	
<<<<<<< HEAD

=======
	
	@GetMapping("/service/{name}")
	public String getService(@PathVariable("name") String name) {
		
		
		return "welcome to our  spring boot service "+name;
		
		
	}
	
	
	
	
	
	
	
>>>>>>> parent of cf8b62f... master commit 4 <add a 3 rd  service method and fix conflit prblm>
	@GetMapping("/service/go")
	public String goService() {
		
		
		return "this is a go service method ";
		
		
	}
	

	@GetMapping("/service/gogo")
	public String goService3() {
		
	return "this is the 3 rd service method ";
	}
<<<<<<< HEAD

	@GetMapping("/service/{name}")
	public String getService(@PathVariable("name") String name) {
		
		
		return "this is a  2 rd go service method ";
		
		
	}

	



=======
	
	
	
	
>>>>>>> parent of cf8b62f... master commit 4 <add a 3 rd  service method and fix conflit prblm>
}
