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
 				return "Hellow Babu" + name;
 	}
@RequestMapping("/welcome/{name}/{age}")
	public String welcome(@PathVariable String name, @PathVariable int age) {
		return "Hellow World" + name + "your age is" + age;
	}
 @RequestMapping("/hii")
 public String hii() {
	 return "Hii This";
 }
=======

@RequestMapping("/hello")
	public String hello() {
		return "Hii This is a new endpoint";
	}

>>>>>>> 6c1e074b9be436b3b0c5a2057143174e29dc9c6a
}
