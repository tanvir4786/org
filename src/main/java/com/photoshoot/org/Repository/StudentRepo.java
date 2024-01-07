package com.photoshoot.org.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photoshoot.org.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
