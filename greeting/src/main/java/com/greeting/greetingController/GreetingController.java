package com.greeting.greetingController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greeting.greetingModel.GreetingModel;
import com.greeting.greetingService.GreetingService;

@RestController
public class GreetingController {

	GreetingService service = new GreetingService();
	
	@GetMapping("/greeting")
	public String greet() {
		return service.doGreet();
	}
	
	@PostMapping("/add")
	public GreetingModel addData(@RequestBody GreetingModel data) {
		GreetingModel response = service.addEmp(data);
		return response;
	}
	
}
