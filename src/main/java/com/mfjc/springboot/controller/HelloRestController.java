package com.mfjc.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloRestController {
	@GetMapping("user")
    public String helloUser() {
        return "Hello miguel jallaza11111111";
    }

    @GetMapping("admin")
    public String helloAdmin() {
        return "Hello franz castro";
    }
}
