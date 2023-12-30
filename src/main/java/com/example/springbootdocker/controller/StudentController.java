package com.example.springbootdocker.controller;


import com.example.springbootdocker.entity.Student;
import com.example.springbootdocker.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/findAll")
    public List<Student> getAllStudent()
    {
        return studentRepo.findAll();
    }

    @PostMapping("/insert")
    public Student insert(@RequestBody Student student)
    {
        return studentRepo.save(student);
    }
}
