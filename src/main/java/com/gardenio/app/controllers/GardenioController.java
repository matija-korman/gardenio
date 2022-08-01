package com.gardenio.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GardenioController {
	
	@GetMapping(value = "/")
	public String home() {
		return "Hello!";
	}

	@GetMapping(value = "/configure")
	public List<String> configure() {
		System.out.print("Configuring garden.....");
		return List.of("PEA","TMT","LET","BEA");
	}
}
