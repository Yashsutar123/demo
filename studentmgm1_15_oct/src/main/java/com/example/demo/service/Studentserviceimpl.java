package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.studentrepo;

@Service
public class Studentserviceimpl implements Studentservice {
	@Autowired
studentrepo repo;
	@Override
	public void savedata(Student s) {
		repo.save(s);
		
	}

	@Override
	public Student getstudent(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void saveall(List<Student> l) {
		repo.saveAll(l);
		
	}

	@Override
	public List<Student> getall() {
		
		return repo.findAll();
	}

}