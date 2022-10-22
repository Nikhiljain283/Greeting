package com.greeting.greetingService;

import org.springframework.stereotype.Service;

import com.greeting.greetingModel.GreetingModel;

@Service
public class GreetingService {

	
	public String doGreet() {
		return "Hello World";
	}

	public GreetingModel addEmp(GreetingModel data) {
		GreetingModel model = new GreetingModel();
		return model;
		
	}
}
