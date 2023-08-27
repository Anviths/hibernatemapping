package edu.ty.Laptop.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.Battery.model.Battery;
import edu.ty.Laptop.model.Laptop;


public class DAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insetLaptop() {
		Laptop laptop=new Laptop();
		laptop.setId(1);
		laptop.setBrand("asus");
		laptop.setRam(8);
		laptop.setPrice(555550);
		
		
		Battery battery=new Battery();
		battery.setBrand("tiger");
		battery.setCapacity(10000);
		battery.setType("li-ion");
		battery.setId(400);
		laptop.setBattery(battery);
		entityTransaction.begin();
		entityManager.persist(battery);
		entityManager.persist(laptop);
		entityTransaction.commit();
	}
	public Laptop findLaptopByid(int id) {
		return entityManager.find(Laptop.class, id);
		
	}
	public void updatePriceById(int id,double price) {
		Laptop laptop=findLaptopByid(id);
		if(laptop!=null) {
			laptop.setPrice(price);
			entityTransaction.begin();
			entityManager.merge(laptop);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	public void deleteLaptopById(int id) {
		Laptop laptop=findLaptopByid(id);
		if(laptop!=null) {
			entityTransaction.begin();
			entityManager.remove(laptop);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
}
