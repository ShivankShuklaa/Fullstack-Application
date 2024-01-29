package com.shivank.studentsystem.service;

import com.shivank.studentsystem.model.Student;
import com.shivank.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {

    // in line number 3 we just implement the Student service

    @Autowired
    private StudentRepository studentRepository;  // it will inject the student repository into our service class


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
