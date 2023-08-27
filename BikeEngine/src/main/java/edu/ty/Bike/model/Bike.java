package edu.ty.Bike.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import edu.ty.Engine.model.Engine;

@Entity
public class Bike {
	@Id
private int id;
	private String brand;
	private String color;
	private double price;
	@OneToOne
	private Engine engine;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", engine=" + engine
				+ "]";
	}
	
	
}
