package com.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.animal.entity.Animal;
import com.animal.service.AnimalService;


@Controller
public class AnimalController {
	@Autowired
	private AnimalService service;

	@GetMapping("/")
	public String home(Model m) {
		List<Animal> animal = service.getAllAnm();
		m.addAttribute("animal", animal);
		return "index";


	}
}
