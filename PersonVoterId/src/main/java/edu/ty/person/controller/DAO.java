package edu.ty.person.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.person.model.Person;
import edu.ty.person.model.VoterId;


public class DAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insetPerson() {
		Person person=new Person();
		person.setId(1);
		person.setAge(25);
		person.setName("vinay");
		person.setPhone_number(12354795225l);
		person.setEmail("vinay@gmail.com");
		VoterId id=new VoterId();
		id.setId(1230);
		id.setVoterNumber("bng455");
		id.setConstiuency("vijaynagra");
		id.setPincode(560017);
		person.setVoterId(id);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(id);
		entityTransaction.commit();
	}
	public Person findPersonByid(int id) {
		return entityManager.find(Person.class, id);
		
	}
	public void updateageById(int id,int age) {
		Person person=findPersonByid(id);
		if(person!=null) {
			person.setAge(age);
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	public void deletePersonById(int id) {
		Person person=findPersonByid(id);
		if(person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
}
