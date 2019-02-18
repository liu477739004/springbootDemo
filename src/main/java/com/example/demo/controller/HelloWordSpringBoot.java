package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.NeoPropertiesDao;

@RestController
public class HelloWordSpringBoot {
	@RequestMapping("/hello")
	public String index(){
		return "hello";
	}
	@RequestMapping("/entity")
	public String entity(){
		NeoPropertiesDao entity = new NeoPropertiesDao();
		entity.setDescription("哈哈");
		return entity.getDescription();
	}
}
