package com.workingtech.firstrestapi.controllers;

import com.workingtech.firstrestapi.Student;
import com.workingtech.firstrestapi.bussiness.StudentBusiness;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private List<Student> studentList = new ArrayList<>();


    @GetMapping("/")
    public List<Student> getAllStudents(){
        Student.incrementCounter();
        return studentList;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return (Student) studentList.stream().filter(x -> x.id == id).toArray()[0];
    }

    @PostMapping("/")
    public Student insertStudent(@RequestBody Student student){
        studentList.add(student);
        return student;
    }

    @PostMapping("/makepayment")
    public boolean payfee(@RequestBody Integer amount){
        StudentBusiness studentBusiness = new StudentBusiness();
        return studentBusiness.makePayment();
    }

}
