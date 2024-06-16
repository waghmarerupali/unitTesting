package com.bikkadit.firstrestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bikkadit.firstrestapp.controller.studentcontroller;

@SpringBootApplication
public class FirstrestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstrestappApplication.class, args);
		
		studentcontroller s1=new studentcontroller();
		s1.getallstudent();
		s1.getstudent();
	}

}
