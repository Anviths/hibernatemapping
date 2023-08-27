package edu.ty.car.contrloller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.car.model.Car;
import edu.ty.tyre.model.Tyre;

public class DAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public void addCar() {
		Car car=new Car();
		car.setId(1);
		car.setBrand("tata");
		car.setColor("blue");
		car.setPrice(500000);
		List<Tyre> list=new ArrayList();
		
			Tyre tyre1=new Tyre();
			tyre1.setBrand("ceat");
			tyre1.setId(101);
			tyre1.setKm(15000);
			tyre1.setPrice(3000);
			Tyre tyre2=new Tyre();
			tyre2.setBrand("ceat");
			tyre2.setId(102);
			tyre2.setKm(15000);
			tyre2.setPrice(3000);
			Tyre tyre3=new Tyre();
			tyre3.setBrand("mrf");
			tyre3.setId(103);
			tyre3.setKm(15000);
			tyre3.setPrice(3500);
			Tyre tyre4=new Tyre();
			tyre4.setBrand("appolo");
			tyre4.setId(104);
			tyre4.setKm(15000);
			tyre4.setPrice(2800);
			list.add(tyre1);
			list.add(tyre2);
			list.add(tyre3);
			list.add(tyre4);
			car.setTyres(list);
			entityTransaction.begin();
			entityManager.persist(tyre1);
			entityManager.persist(tyre2);
			entityManager.persist(tyre3);
			entityManager.persist(tyre4);
			entityManager.persist(car);
			entityTransaction.commit();
		
	}
	public Car findCarById(int id) {
		return entityManager.find(Car.class, id);
	}
	public void updateCarPriceById(int id,double price) {
		Car car=findCarById(id);
		if(car!=null) {
			
			car.setPrice(price);
			entityTransaction.begin();
			entityManager.merge(car);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	public void deleteCarById(int id) {
		Car car=findCarById(id);
		if(car!=null) {
			
			entityTransaction.begin();
			entityManager.remove(car);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
}
