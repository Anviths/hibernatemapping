package edu.ty.author.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.author.model.Author;
import edu.ty.book.model.Book;

public class DAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void addBook() {

		Author author = new Author();

		author.setId(1);
		author.setName("poornachard tejaswi");
		author.setAge(88);
			Book book1 = new Book();
			book1.setId(101);
			book1.setTitle("krishegodra ane");
			book1.setPublicationYear(1985);
			book1.setPrice(1500);
			book1.setAuthor(author);
			Book book2 = new Book();
			book2.setId(103);
			book2.setTitle("rahasya");
			book2.setPublicationYear(1990);
			book2.setPrice(500);
			book2.setAuthor(author);
			entityTransaction.begin();
			entityManager.persist(book1);
			entityManager.persist(book2);
		entityManager.persist(author);
		entityTransaction.commit();
	}

	public Book findBook(int id) {

		return entityManager.find(Book.class, id);
	}

	

	public void updateBookPriceById(int id, double price) {
		Book book = findBook(id);
		if (book != null) {
			entityTransaction.begin();
			book.setPrice(price);
			entityManager.merge(book);
			entityTransaction.commit();
		} else {
			System.out.println("no record found");
		}
	}

	public void deleteBookById(int id) {
		Book book = findBook(id);
		if (book != null) {
			entityTransaction.begin();

			entityManager.remove(book);
			entityTransaction.commit();
		} else {
			System.out.println("no record found");
		}
	}
}
