package edu.ty.user.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.product.mode.Product;
import edu.ty.user.model.User_1;

public class DAO {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void createUser() {
		User_1 user=new User_1();
		user.setId(1);
		user.setName("vinod");
		user.setEmail("vinod@gmail.com");
		user.setAge(35);
		user.setPhone_number(987025525);
		Product product1=new Product();
		product1.setId(102);
		product1.setName("lg tv");
		product1.setPrice(10252);
		product1.setDescription("andriod tv");
		Product product2=new Product();
		product2.setId(103);
		product2.setName("mobile");
		product2.setPrice(40252);
		product2.setDescription("apple phone");
		
		List<Product> products=new ArrayList<Product>();
		products.add(product2);
		products.add(product1);
		user.setProducts(products);
		entityTransaction.begin();
		entityManager.persist(user);
		entityManager.persist(product1);
		entityManager.persist(product2);
		entityTransaction.commit();
	}
	public User_1 findUser(int id) {
		return entityManager.find(User_1.class, id);
		
	}
	public void updateNameById(int id,String name) {
		User_1 user=findUser(id);
		if(user!=null) {
			user.setName(name);
			entityTransaction.begin();
			entityManager.merge(user);
			entityTransaction.commit();
		}
		else
			System.out.println("no record");
	}
	public void deleteUserById(int id,String name) {
		User_1 user=findUser(id);
		if(user!=null) {
			user.setName(name);
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
		}
		else
			System.out.println("no record");
	}
}
