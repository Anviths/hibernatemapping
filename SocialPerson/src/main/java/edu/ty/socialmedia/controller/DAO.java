package edu.ty.socialmedia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.person.model.Person;
import edu.ty.socialmedia.model.SocialMedia;

public class DAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void createPerson() {
		Person person=new Person();
		person.setId(2);
		person.setAge(25);
		person.setName("puspha");
		person.setPhone_number(86354795225l);
		person.setEmail("puspha@gmail.com");
		List<SocialMedia> social=new ArrayList<SocialMedia>();
		SocialMedia media1=new SocialMedia();
		media1.setSocialId(103);
		 media1.setSocialMediaName("facebook");
		 media1.setFoundedYear(2008);
		 media1.setHeadQuaters("usa");
		 SocialMedia media2=new SocialMedia();
		 media2.setSocialId(104);
		 media2.setSocialMediaName("instagram");
		 media2.setFoundedYear(2011);
		 media2.setHeadQuaters("usa");
		 social.add(media1);
		 social.add(media2);
		 person.setSocial(social);
		 entityTransaction.begin();
		 entityManager.persist(media1);
		 entityManager.persist(media2);
			entityManager.persist(person);
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
	public void deletepersonById(int id) {
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
