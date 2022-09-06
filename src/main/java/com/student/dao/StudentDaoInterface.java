package com.student.dao;

import java.util.List;

import com.student.model.Student;

public interface StudentDaoInterface {
	

		public void saveStudent(Student student);
		
		public List<Student> getAllStudent();
		public Student findStudent(int stdId);
		public void updateStudent(Student student);
		public void deleteStudent(Student student);
		
	}


