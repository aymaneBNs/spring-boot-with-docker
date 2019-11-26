package com.aimene.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	
	
	
	
	@GetMapping("/service/go")
	public String goService() {
		
		
		return "this is a go service method ";
		
		
	}
	

	@GetMapping("/service/gogo")
	public String goService3() {
		
		
		return "this is a  3 rd go service method ";
		
		
	}
	
	
	
	@GetMapping("/service/{name}")
	public String getService(@PathVariable("name") String name) {
		
		
		return "welcome to our  spring boot service "+name;
		
		
	}

	
	
	
	
	
	

}
