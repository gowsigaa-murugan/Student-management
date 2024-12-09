package com.example.demowithstudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demowithstudent.model.*;
import com.example.demowithstudent.service.*;

@Controller
public class StudentController {
	@Autowired
	StudentService ob;
	@GetMapping("/home")
	public String open()
	{
		return "index";
	}
@PostMapping("abc")// data insert
public String open1( Student s)
{
	
	ob.savefile(s);// service file to share
	return "success";
}
@GetMapping("/student")
public String open2(Model m)
{
	
m.addAttribute("abc",ob.get());
return "select";
	
}
}
