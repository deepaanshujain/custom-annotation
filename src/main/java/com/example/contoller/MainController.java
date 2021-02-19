package com.example.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ServiceResponse;
import com.example.service.MainService;

@RestController
@RequestMapping("/")
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping("testAnnotation")
	public ServiceResponse testAnnotation() {
		
		return new ServiceResponse(HttpStatus.OK.value(), "Success", mainService.testAnnotation());
	}

}
