package com.demo.springmongo.controller;

import com.demo.springmongo.model.Student;
import com.demo.springmongo.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private StudentRepository StudentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.StudentRepository = studentRepository;
    }

    @GetMapping("/all")
    public List<Student> GetAll() {
        return this.StudentRepository.findAll();
    }
}
