package edu.ty.country.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.country.model.Country;
import edu.ty.president.model.President;

public class DAO {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insretPresident() {
		President president=new President();
		president.setId(1);
		president.setAge(25);
		president.setName("draupdi murmu");
		president.setPhone(12354795225l);
	
		Country country=new Country();
		country.setId(1);
		country.setContinent("asia");
		country.setName("india");
		country.setArea(85000);
		president.setCountry(country);
		entityTransaction.begin();
		entityManager.persist(president);
		entityManager.persist(country);
		entityTransaction.commit();
	}
	public President findPresidentByid(int id) {
		return entityManager.find(President.class, id);
		
	}
	public void updatePresidentAgeById(int id,int age) {
		President president=findPresidentByid(id);
		if(president!=null) {
			president.setAge(age);
			entityTransaction.begin();
			entityManager.merge(president);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	public void deletePresidentById(int id) {
		President president=findPresidentByid(id);
		if(president!=null) {
			entityTransaction.begin();
			entityManager.remove(president);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
}
