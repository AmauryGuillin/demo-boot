package com.formation.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

import com.formation.service.Calculator;

@RestController
public class CalculatorController {
	
	@Autowired
	private Calculator calculator;
	
	@RequestMapping("/sum")
	String sum(@RequestParam("a")Integer a,@RequestParam("b") Integer b) {
		return String.valueOf(calculator.sum(a, b));
	}
}
