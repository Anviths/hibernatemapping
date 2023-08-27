package edu.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.country.model.Country;
import edu.ty.state.model.State;

public class DAO {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void addCountry() {
		Country country = new Country();
		country.setId(1);
		country.setName("india");
		country.setArea(7252525);

		State state = new State();
		state.setId(1);
		state.setName("karnataka");
		state.setArea(38522);
		state.setCapital("bengluru");
		State state2 = new State();
		state2.setId(2);
		state2.setName("telgana");
		state2.setArea(3800);
		state2.setCapital("hydrabad");
		List<State> list = new ArrayList();
		list.add(state);
		list.add(state2);
		country.setStates(list);
		entityTransaction.begin();
		entityManager.persist(state);
		entityManager.persist(state2);
		entityManager.persist(country);
		entityTransaction.commit();

	}

	public Country findCountryById(int id) {
		return entityManager.find(Country.class, id);

	}

	public void updateCountryAreaById(int id, int area) {
		Country country = findCountryById(id);
		if (country != null) {

			country.setArea(area);
			entityTransaction.begin();
			entityManager.merge(country);
			entityTransaction.commit();
		} else {
			System.out.println("no record found");
		}
	}
	public void deleteCountryById(int id) {
		Country country = findCountryById(id);
		if (country != null) {

			entityTransaction.begin();
			entityManager.remove(country);
			entityTransaction.commit();
		} else {
			System.out.println("no record found");
		}
	}
}
