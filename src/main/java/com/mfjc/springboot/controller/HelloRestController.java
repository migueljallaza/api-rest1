package com.mfjc.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloRestController {
	@GetMapping("user")
    public String helloUser() {
        return "Hello MICKY";
    }

    @GetMapping("admin")
    public String helloAdmin() {
        return "Hello FRANZ";
    }
}
