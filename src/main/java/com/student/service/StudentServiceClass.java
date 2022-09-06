package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.StudentDaoInterface;
import com.student.model.Student;

@Service
@Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
public class StudentServiceClass implements StudentServiceInterface {
	
		@Autowired
		StudentDaoInterface studentDaoInterface;

		@Override
		public void saveStudent(Student student) {
			System.out.println("inside StudentServiceClass ----> ");

			studentDaoInterface.saveStudent(student);
		}
		
		@Override	
		public List<Student> getAllStudent()  {
			System.out.println("Inside display method...");
			return studentDaoInterface.getAllStudent();
		}

		
		@Override
		public Student findStudent(int stdId) {
			System.out.println("inside findStudent service Method");
			return studentDaoInterface.findStudent(stdId);
		}
		@Override
		public void updateStudent(Student student) {
			System.out.println("inside updateStudent Service Method");
			studentDaoInterface.updateStudent(student);
		}
		@Override
		public void deleteStudent(Student student) {
			System.out.println("inside deleteStudent service Method");
			studentDaoInterface.deleteStudent(student);
		}  



		


}
