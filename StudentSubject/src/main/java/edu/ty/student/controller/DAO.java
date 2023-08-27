package edu.ty.student.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.student.model.Student;
import edu.ty.subject.model.Subject;

public class DAO {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void addSubject() {
		Student student=new Student();
		student.setId(1);
		student.setName("nandhan");
		student.setEmail("nandhan@gmail.com");
		student.setPhoneNumber("1252525225");
		
		Subject subject1=new Subject();
		subject1.setId(101);
		subject1.setName("java");
		subject1.setNumberofDay(90);
		subject1.setPrice(10000);
		Subject subject2=new Subject();
		subject2.setId(102);
		subject2.setName("html");
		subject2.setNumberofDay(90);
		subject2.setPrice(10000);
		List<Subject> subjects=new ArrayList<Subject>();
		subjects.add(subject1);
		subjects.add(subject2);
		entityTransaction.begin();
		
		 student.setSubjects(subjects);
		entityManager.persist(subject1);
		entityManager.persist(subject2);
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	private Student findStudentById(long id) {
		return entityManager.find(Student.class,id);
	}
	
	public void updateStudentName(long id,String name) {
		Student student =findStudentById(id);
		if(student!=null) {
			student.setName(name);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			System.out.println("updated");
		}
		else
		System.out.println("no record found");
		
	}
	public void delteSubject(long id) {
		Student student =findStudentById(id);
		if(student!=null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			System.out.println("deleted");
		}
		else
		System.out.println("no record found");
		
	}
	
	
}
