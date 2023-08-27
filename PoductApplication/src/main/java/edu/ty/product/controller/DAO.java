package edu.ty.product.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.application.model.Application;
import edu.ty.product.mode.Product;

public class DAO {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void createProduct() {
		Application app=new Application();
		app.setId(1l);
		app.setName("amazon");
		app.setVersion("2.01");
		Product product1=new Product();
		product1.setId(102);
		product1.setName("lg tv");
		product1.setPrice(10252);
		product1.setDescription("andriod tv");
		product1.setApplication(app);
		Product product2=new Product();
		product2.setId(103);
		product2.setName("mobile");
		product2.setPrice(40252);
		product2.setDescription("apple phone");
		product2.setApplication(app);
		entityTransaction.begin();
		entityManager.persist(app);
		entityManager.persist(product1);
		entityManager.persist(product2);
		entityTransaction.commit();
		
	}
	public Product findProductById(int id) {
		return entityManager.find(Product.class, id);
	}
	public void updateProductDescriptionById(int id,String description) {
		Product product=findProductById(id);
		if(product!=null) {
			product.setDescription(description);entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	
	public void deleteProductById(int id) {
		Product product=findProductById(id);
		if(product!=null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
}
