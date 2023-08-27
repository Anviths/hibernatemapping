package edu.ty.mobile.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.application.model.Application;
import edu.ty.mobile.model.Mobile;

public class DAO {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public void addMobile() {
		Mobile mobile=new Mobile();
		mobile.setId(1);
		mobile.setBrand("vivo");
		mobile.setModel("v25");
		mobile.setPrice(35000);
		Application app1=new Application();
		app1.setId(101l);
		app1.setName("contacts");
		app1.setVersion("2.01");
		Application app2=new Application();
		app2.setId(102l);
		app2.setName("photo");
		app2.setVersion("12.01");
		Application app3=new Application();
		app3.setId(103l);
		app3.setName("google");
		app3.setVersion("12.01");
		
		List<Application> list=new ArrayList<Application>();
		list.add(app3);
		list.add(app1);
		list.add(app2);
		mobile.setApplications(list);
		entityTransaction.begin();
		entityManager.persist(app1);
		entityManager.persist(app2);
		entityManager.persist(app3);
		entityManager.persist(mobile);
		entityTransaction.commit();
	}
	public Mobile findMobileById(int id) {
		return entityManager.find(Mobile.class, id);
	}
	public void updateMobilePriceById(int id,double price) {
		Mobile mobile=findMobileById(id);
		if(mobile!=null) {
			
			mobile.setPrice(price);
			entityTransaction.begin();
			entityManager.merge(mobile);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	public void deleteMobileById(int id,double price) {
		Mobile mobile=findMobileById(id);
		if(mobile!=null) {
			
			mobile.setPrice(price);
			entityTransaction.begin();
			entityManager.remove(mobile);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
}
