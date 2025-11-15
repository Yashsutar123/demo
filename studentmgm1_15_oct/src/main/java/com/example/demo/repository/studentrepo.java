package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;


@Service
public interface studentrepo extends JpaRepository<Student, Integer>{

}
