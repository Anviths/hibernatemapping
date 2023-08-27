package edu.ty.movie.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.actor.model.Actor;
import edu.ty.actor.model.Gender;
import edu.ty.movie.model.Movie;

public class DAO {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void addMovies() {
		Movie movie=new Movie();
		movie.setId(1);
		movie.setTitle("rrr");
		movie.setYear(2022);
		
		Actor actor1=new Actor();
		actor1.setId(101);
		actor1.setAge(38);
		actor1.setName("RAmcharan");
		actor1.setGender(Gender.MALE);
		Actor actor2=new Actor();
		actor2.setId(102);
		actor2.setAge(45);
		actor2.setName("NTR");
		actor2.setGender(Gender.MALE);
		Actor actor3=new Actor();
		actor3.setId(103);
		actor3.setAge(38);
		actor3.setName("aliya bhat");
		actor3.setGender(Gender.FEMALE);
		
		List<Actor> actors=new ArrayList<Actor>();
		actors.add(actor3);
		actors.add(actor2);
		actors.add(actor1);
		movie.setActors(actors);
		entityTransaction.begin();
		entityManager.persist(actor1);
		entityManager.persist(actor2);
		entityManager.persist(actor3);
		entityManager.persist(movie);
		entityTransaction.commit();
	}
	public Movie findMovieById(int id) {
		return entityManager.find(Movie.class, id);
		
	}
	public void updateYearById(int id,int year) {
		Movie movie=findMovieById(id);
		if(movie!=null) {
			movie.setYear(year);
			entityTransaction.begin();
			entityManager.merge(movie);
			entityTransaction.commit();
		}
		else
			System.out.println("no record found");
	}
	public void deleteMovieById(int id) {
		Movie movie=findMovieById(id);
		if(movie!=null) {
			entityTransaction.begin();
			entityManager.remove(movie);
			entityTransaction.commit();
		}
		else
			System.out.println("no record found");
	}
}
