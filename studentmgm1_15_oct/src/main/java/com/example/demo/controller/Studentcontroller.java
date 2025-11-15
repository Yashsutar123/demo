package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.Studentservice;




public class Studentcontroller {
	@Autowired
	Studentservice sc;
	@PostMapping("student")
String addstudent(Student s) {
		
		sc.savedata(s);
	return "student saved";
}

@PostMapping("students")
String saveall(List<Student>l) {
	sc.saveall(l);
	return "all saved";
	
}
@GetMapping("student/{id}")
Student getstudent(@PathVariable int id) {
	return sc.getstudent(id);
}

@GetMapping("students")
List<Student> getall(){
	return sc.getall();
			
	
}
}
