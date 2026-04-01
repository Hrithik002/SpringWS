package com.mphasis.firstspringapp.service;

import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService {

    private String studentId = "101";
    private String name = "Meghana";
    private String grade ="A+";

    // Setter methods (required for setter injection)
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Getter methods
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    // Utility method to display details
    public void displayStudentInfo() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Grade      : " + grade);
    }
}

