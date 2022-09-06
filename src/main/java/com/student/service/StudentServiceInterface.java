package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentServiceInterface {

		public void saveStudent(Student student);
		
		public List<Student> getAllStudent();
		public Student findStudent(int stdId);
		public void updateStudent(Student student);
		public void deleteStudent(Student student);
		
	}


