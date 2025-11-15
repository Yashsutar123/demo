package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Student;



public interface Studentservice {
	void savedata(Student s);
	Student getstudent(int id);
	void saveall(List<Student>l);
	List<Student>getall();

}