package com.bikkadit.firstrestapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.firstrestapp.studentmodel.student;

@RestController
public class studentcontroller {
	
	@GetMapping("/student")
	public student getstudent() {
		student s=new student();
		s.setId(1);
		s.setSname("rupali");
		s.setSaddr("nilanga");
		
		return s;
		
	}
	
	@GetMapping("/getstudents")
	public List<student> getallstudent(){
		
		student s1=new student();
		s1.setId(2);
		s1.setSname("dipali");
		s1.setSaddr("nilanga");
		
		
		student s2=new student();
		s2.setId(3);
		s2.setSname("vaishali");
		s2.setSaddr("nilanga");
		
		
		student s3=new student();
		s3.setId(4);
		s3.setSname("kamini");
		s3.setSaddr("nilanga");
		
		List l=new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		
		return l;
	}

}