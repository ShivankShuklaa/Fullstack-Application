package com.shivank.studentsystem.service;

import com.shivank.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    // here we write the methods
    public Student saveStudent(Student student); // this method is for saving the data into the database
    public List<Student> getAllStudents();  // this method is for the getting the data from database

    //now we implement this method to StudentServiceImpl
}
