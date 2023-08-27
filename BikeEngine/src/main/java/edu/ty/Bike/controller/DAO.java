package edu.ty.Bike.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.Bike.model.Bike;
import edu.ty.Engine.model.Engine;

public class DAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insetBike() {
		Bike bike=new Bike();
		bike.setId(1);
		bike.setBrand("hero");
		bike.setColor("mat blue");
		bike.setPrice(458552);
		
		Engine engine=new Engine();
		engine.setId(101);
		engine.setEngineNumber("abc122");
		engine.setType("4-stroke");
		engine.setCc(100);
		bike.setEngine(engine);
		entityTransaction.begin();
		entityManager.persist(engine);
		entityManager.persist(bike);
		entityTransaction.commit();
	}
	public Bike findBikeByid(int id) {
		return entityManager.find(Bike.class, id);
		
	}
	public void updatePriceById(int id,double price) {
		Bike bike=findBikeByid(id);
		if(bike!=null) {
			bike.setPrice(price);
			entityTransaction.begin();
			entityManager.merge(bike);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	public void deleteBikeById(int id) {
		Bike bike=findBikeByid(id);
		if(bike!=null) {
			entityTransaction.begin();
			entityManager.remove(bike);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
}
