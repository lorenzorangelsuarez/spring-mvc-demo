package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// Create a Student object
		Student theStudent = new Student();
		// Add Student object to the model
		model.addAttribute(theStudent);
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student student) {
		
		// log the input data
		System.out.println("The student: " + student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}

}
