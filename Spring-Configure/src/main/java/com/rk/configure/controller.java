package com.rk.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	@Autowired
	private ApiConfig apiConfig;
	@GetMapping("/hello")
	public String hello()
	{
		return apiConfig.getHost() +" " + apiConfig.getPort()+" " + apiConfig.getTimer();
	}

}
