package edu.ty.country.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import edu.ty.state.model.State;


@Entity
public class Country {
@Id
	private int id;
	private String name;
	private int area;
	@OneToMany
	private List<State> states;
	
	
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", area=" + area + ", state=" + states + "]";
	}

	
	
	
}
