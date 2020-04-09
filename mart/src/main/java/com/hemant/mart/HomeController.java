package com.hemant.mart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String home() {
		return "<h2>this is from home controller</h2>";
	}

}
