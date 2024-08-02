package com.workingtech.firstrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// MVC
// Model - data for View , data for html
// View - html templates
// Controller(get, post - http verbs)))

// /students/ (get)-> getAllStudents
// /students/{id} (get)-> get single Student
// /students/ (post) -> insert single student

@SpringBootApplication
public class FirstrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstrestapiApplication.class, args);
	}

}
