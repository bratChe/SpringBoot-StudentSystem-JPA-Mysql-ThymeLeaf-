package com.sb.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sb.sms.entity.Student;
import com.sb.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1= new Student("Ramesh", "Fadatare" , "ram@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2= new Student("Rama", "Lama" , "ramamama@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3= new Student("John", "Wick" , "hitman@gmail.com");
//		studentRepository.save(student3);
//		
		
		
	}

	
	
}
