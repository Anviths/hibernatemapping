package edu.ty.movie.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import edu.ty.actor.model.Actor;

@Entity
public class Movie {
	@Id
	private int id;
	private String title;
    private int year;
    @ManyToMany
    private List<Actor> actors;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", actors=" + actors + "]";
	}
    
}
