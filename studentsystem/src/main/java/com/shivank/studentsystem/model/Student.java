package com.shivank.studentsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// this is the entity class
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // it will make the id auto incremented


    private int id;
    private String name;
    private int klass;
    private int roll;


    public Student() {
        // this is the constructor
    }


    // below four are generated getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
