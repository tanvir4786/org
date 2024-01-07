package com.photoshoot.org.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoshoot.org.Entity.Student;
import com.photoshoot.org.Repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;

	public Student saveStudentDetails(Student student) {
		return studentRepo.save(student);

	}

}
