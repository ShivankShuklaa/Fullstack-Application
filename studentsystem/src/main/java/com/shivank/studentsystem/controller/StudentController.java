package com.shivank.studentsystem.controller;


import com.shivank.studentsystem.model.Student;
import com.shivank.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")  //just to give the student path everytime
public class StudentController {

    @Autowired
    private StudentService studentService;  //we will inject the student service here

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is added";
    }
    
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();

    }


}
