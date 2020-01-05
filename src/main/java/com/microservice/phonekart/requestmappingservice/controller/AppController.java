package com.microservice.phonekart.requestmappingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.phonekart.requestmappingservice.ResponseTO.Response;

@RestController
@CrossOrigin
public class AppController {

	@Autowired
	CartServiceProxy cartserviceProxy;
	
	@Autowired
	Response response;
	
	@GetMapping(path="/test")
	public String getString() {
		
		return ("<h1> Ankit is the best </h1>");
	}
	
	 @GetMapping(path="/myrequest/getTotalItems")
	public String getCartCount() {
		 return cartserviceProxy.getCartCount();
	 }
	 
	 @GetMapping(path="/check" , produces=MediaType.APPLICATION_JSON_VALUE)
	 public Response checkConnection() {
		 
		  response.setMessage("Something big is returning from this Method......!!!!!!!!!!");
		 
		  return response;
	 }
}
