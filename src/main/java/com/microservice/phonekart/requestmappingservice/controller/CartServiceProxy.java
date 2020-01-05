package com.microservice.phonekart.requestmappingservice.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="cart-service" , url="localhost:8100")
@FeignClient(name="cart-service")
@RibbonClient(name="cart-service")
public interface CartServiceProxy {

	@GetMapping(path="/mycart/getTotalItems")
	public String getCartCount();
}
