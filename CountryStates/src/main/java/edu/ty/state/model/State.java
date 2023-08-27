package edu.ty.state.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	private int id;
	private String name;
    private String capital;
    private double area;
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
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", capital=" + capital + ", area=" + area + "]";
	}
    
	
}
