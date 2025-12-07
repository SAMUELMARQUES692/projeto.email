package com.Kipper.First_Spring_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Kipper.First_Spring_App.domain.User;
import com.Kipper.First_Spring_App.service.HelloWorldService;

@RestController
//STATELESS -> A cada nova requiseção, eu recebo todas as informações que preciso para fazer aquela funcionalidade que o cliente pedi. 
//STETEFULL -> O estado de cada cliente e mandido no servidor.

@RequestMapping("/hello-world")
public class HelloWorldController {
	//post, get, delete, put, patch, options, head
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@GetMapping
	public String HelloWorld() {
		return helloWorldService.HelloWorld("Matheus");
	}	
	
	@PostMapping("/{id}")
	public String HelloWorldPost(@PathVariable String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
		return "Hello World " + body.getName() + filter;
	}
	
	
}
