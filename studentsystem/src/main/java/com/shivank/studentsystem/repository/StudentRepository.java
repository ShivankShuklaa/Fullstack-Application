package com.shivank.studentsystem.repository;

import com.shivank.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


    // in line 6 we extend it to Jpa repository and inside tag we give model name and type of the id ,
    // ex <modelname, typeofid>


}
