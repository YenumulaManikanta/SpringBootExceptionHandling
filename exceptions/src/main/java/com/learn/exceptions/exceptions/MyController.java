package com.learn.exceptions.exceptions;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/error-msg")
	public String getData(@PathParam("data") String data) {
		if(data.equals("")) 
			throw new MyCustomException("Data not found");
	
		return "Creating Exception Handling Framework !!!";
	}

}
