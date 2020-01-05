package com.microservice.phonekart.requestmappingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	CartServiceProxy cartserviceProxy;
	
	@GetMapping(path="/test")
	public String getString() {
		
		return ("<h1> Ankit is the best </h1>");
	}
	
	 @GetMapping(path="/myrequest/getTotalItems")
	public String getCartCount() {
		 return cartserviceProxy.getCartCount();
	 }
}
