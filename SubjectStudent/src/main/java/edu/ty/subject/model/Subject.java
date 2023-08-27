package edu.ty.subject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	private long id;
	private String name;
	private int numberofDay;
	private double price;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberofDay() {
		return numberofDay;
	}
	public void setNumberofDay(int numberofDay) {
		this.numberofDay = numberofDay;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", numberofDay=" + numberofDay + ", price=" + price
				+  "]";
	}
	
	
	
	
}
