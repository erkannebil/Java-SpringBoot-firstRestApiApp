package com.workingtech.firstrestapi.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    //get
    @GetMapping("/")
    public String getTeachers(){
        return "Teachers";
    }
}
