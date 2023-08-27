package edu.ty.food.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.chef.model.Chef;
import edu.ty.food.model.Food;

public class DAO {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void createFood() {
		Chef chef=new Chef();
		chef.setAge(45);
		chef.setId(3);
		chef.setName("rammana");
		chef.setExperienceYears(25);
		chef.setSpeciality("indian");
		Food food=new Food();
		food.setId(101);
		food.setName("idly");
		food.setType("veg");
		food.setPrice(50);
		food.setChef(chef);
		Food food1=new Food();
		food1.setId(102);
		food1.setName("briyani");
		food1.setType("non-veg");
		food1.setPrice(450);
		food1.setChef(chef);
		entityTransaction.begin();
		entityManager.persist(food1);
		entityManager.persist(food);
		entityManager.persist(chef);
		entityTransaction.commit();
	}
	public Food findFoodById(int id) {
		return entityManager.find(Food.class, id);
	}
	public void updatePriceById(int id,double price) {
		Food food=findFoodById(id);
		if(food!=null) {
			food.setPrice(price);
			entityTransaction.begin();
			entityManager.merge(food);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	public void deleteFoodById(int id) {
		Food food=findFoodById(id);
		if(food!=null) {
			entityTransaction.begin();
			entityManager.remove(food);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	
}
