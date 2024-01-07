package com.photoshoot.org.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoshoot.org.Entity.Student;
import com.photoshoot.org.Service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.saveStudentDetails(student);
	}

}
