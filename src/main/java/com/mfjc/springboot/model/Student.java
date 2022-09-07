package com.mfjc.springboot.model;

import lombok.Data;

@Data
public class Student {
    
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    
}
