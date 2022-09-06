package com.student.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository("studentDaoInterface")
public class StudentDaoClass implements StudentDaoInterface {
	
		@Autowired
		SessionFactory sessionFactory;
		
		public void saveStudent(Student student) {
			System.out.println("Inside the StudentDaoClass---> ");
			Session session=sessionFactory.openSession();
			session.save(student);
			session.beginTransaction().commit();
			session.close();
			
		}
		
	public List<Student> getAllStudent()  {
			Session session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria("Student.class");
			return criteria.list();
			
		}

		

		public Student findStudent(int stdId) {
		System.out.println("inside findStudent Dao method");
		Session session=sessionFactory.openSession();
		Student student=session.get(Student.class, stdId);
		session.close();
		
		return student;
		}

		public void updateStudent(Student student) {
		System.out.println("inside updateStudent dao Method");
		Session session=sessionFactory.openSession();
		session.update(student);
		session.beginTransaction().commit();
		session.close();
			
		}

		public void deleteStudent(Student student) {
	     System.out.println("inside deleteStudent dao method");
	     Session session=sessionFactory.openSession();
	     session.delete(student);
	     session.beginTransaction().commit();
	     session.close();
		}  

	





}
