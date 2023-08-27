package edu.ty.bankaccount.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.bankaccount.model.BankAccount;
import edu.ty.person.model.Person;

public class DAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void createBankAccount() {
		Person person = new Person();
		person.setId(1);
		person.setAge(25);
		person.setName("jeevith");
		person.setPhone_number(94454795225l);
		person.setEmail("jeeviyth@gmail.com");
		BankAccount account1 = new BankAccount();
		account1.setId(101);
		account1.setAccountNumber("14525225");
		account1.setBankName("icici");
		account1.setPerson(person);
		BankAccount account2 = new BankAccount();
		account2.setId(102);
		account2.setAccountNumber("14533225");
		account2.setBankName("axis");
		account2.setPerson(person);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityTransaction.commit();

	}

	public BankAccount findBankAccountById(int id) {
		return entityManager.find(BankAccount.class, id);
	}

	public void updateAccountNumberById(int id, String accountNumber) {
		BankAccount account = findBankAccountById(id);
		if (account != null) {
			account.setAccountNumber(accountNumber);
			entityTransaction.begin();
			entityManager.merge(account);
			entityTransaction.commit();
			System.out.println("updated");
		} else {
			System.out.println("no record found");
		}

	}

	public void deleteBankAccount(int id) {
		BankAccount account = findBankAccountById(id);
		if (account != null) {
			entityTransaction.begin();
			entityManager.remove(account);
			entityTransaction.commit();
			System.out.println("deleted");
		} else {
			System.out.println("no record found");
		}
	}
}
