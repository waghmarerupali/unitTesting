package com.bikkadit.bookticket.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.bookticket.request.passanger;
import com.bikkadit.bookticket.response.ticket;

@RestController
public class ticketcontroller {
	
	@PostMapping(value="/bookticket",consumes={"application/xml","application/json"},produces= {"application/xml","application/json"})
	public ResponseEntity<ticket> bookticket(@RequestBody passanger psg){
		
		System.out.println(psg);
		
		ticket t=new ticket();
		t.setPnr("123456");
		t.setFrom("nilanga");
		t.setTid(12);
		t.setTo("pune");
		t.setPrice(2000);
		
		
		
		
		
		
		return  new ResponseEntity<ticket>(t,HttpStatus.OK);
		
	}

}
