package com.briz.spring_boot_Input;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@GetMapping("/test")

	
	public String home() {
		return "Hello World!";
}
@GetMapping("/{name}")
 	public String welcome(@PathVariable String name) {
 				return "Hellow World" + name;
 	}
@RequestMapping("/welcome/{name}/{age}")
	public String welcome(@PathVariable String name, @PathVariable int age) {
		return "Hellow World" + name + "your age is" + age;
	}

@RequestMapping("/hello")
	public String hello() {
		return "Hii This is a new endpoint";
	}

}
