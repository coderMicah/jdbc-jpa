package com.Micah.jpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Micah.jpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;


//import com.Micah.jpaandhibernate.course.jdbc.CourseJdbcRepository;
//import com.Micah.jpaandhibernate.course.jpa.CourseJpaRepository;



@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1, "Typescript", "Net Ninja"));
		repository.save(new Course(2, "Javascript", "Brad Traversy"));
		repository.save(new Course(3, "JAVA", "In28min"));
		repository.save(new Course(4, "Python", "Mosh Hamedani"));
		
		
		repository.deleteById(3l);
		
		System.out.println(repository.findById(2l));
	}

}
