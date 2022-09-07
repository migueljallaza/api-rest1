package com.mfjc.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfjc.springboot.model.Student;

@RestController
@RequestMapping("appweb")
public class HelloRestController {

    //respuesta en json de un solo objeto
    @GetMapping("/student")
	public Student getStudent() {
		return new Student("Ramesh", 5);
	}
    // varios objetos
	@GetMapping("/students")
	public List<Student> getStudents(){		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ramesh", 1));
		students.add(new Student("Tony", 2));
		students.add(new Student("Sanjay", 3));
		return students;
	}
}
