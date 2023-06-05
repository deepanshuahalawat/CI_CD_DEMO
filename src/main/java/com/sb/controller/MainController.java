package com.sb.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/test")
	public String testReq() {
		System.out.println("Method called ");
		return "Hello app is up, "+new Date();
	}
}
