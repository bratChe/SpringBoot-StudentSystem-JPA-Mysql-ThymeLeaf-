package com.sb.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.sms.entity.Student;
import com.sb.sms.repository.StudentRepository;
import com.sb.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository  studRepository;
	
	public StudentServiceImpl(StudentRepository studRepository) {
		super();
		this.studRepository = studRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		
		return studRepository.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		
		return studRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studRepository.save(student);
	}



	@Override
	public void  deleteStudentById(Long id) {
		
		studRepository.deleteById(id);
	}

}
