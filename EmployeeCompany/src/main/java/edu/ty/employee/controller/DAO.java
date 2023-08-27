package edu.ty.employee.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.company.model.Company;
import edu.ty.employee.model.Employee;

public class DAO {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void createEmployee() {
		Company company=new Company();
		company.setId(1);
		company.setName("testyantra");
		company.setGstNumber("adssasa");
		company.setRegstrationNumber("124512");
		Employee employee1=new Employee();
		employee1.setId(101);
		employee1.setName("anvith");
		employee1.setEmail("anvith@gmail.com");
		employee1.setPassword("12345");
		employee1.setPhone(897032525l);
		employee1.setCompany(company);
		Employee employee2=new Employee();
		employee2.setId(102);
		employee1.setName("sandeep");
		employee1.setEmail("sandeep@gmail.com");
		employee1.setPassword("123@45");
		employee1.setPhone(8970944525l);
		employee1.setCompany(company);
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityTransaction.commit();
	}
	public Employee findBook(int id) {

		return entityManager.find(Employee.class, id);
	}

	

	public void updateEmployeeNameById(int id, String name) {
		Employee employee=findBook(id);
		if(employee!=null) {
		employee.setName(name);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
			}
			else {
				System.out.println("no record");
			}
	}
	public void deleteEmployeeById(int id) {
		Employee employee=findBook(id);
		if(employee!=null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record");
		}
	}
}
