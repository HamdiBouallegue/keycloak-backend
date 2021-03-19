package com.hamdiBouallegue.keycloakdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamdiBouallegue.keycloakdemo.model.SenderResponse;

@RestController
@RequestMapping(value = "/api")
public class DemoController {

	@GetMapping(value="/demo")
	public SenderResponse adminEndPoint() {
		return new SenderResponse("Hello From Admin");
	}
	@GetMapping(value="/manager")
	public SenderResponse managerEndPoint() {
		return new SenderResponse("Hello From Manager");
	}
}
