package edu.ty.car.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import edu.ty.tyre.model.Tyre;

@Entity
public class Car {
	@Id
	private int id;
	private String brand;
	private String color;
	private double price;
	@OneToMany
	private List<Tyre> tyres;
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
	
	public List<Tyre> getTyres() {
		return tyres;
	}
	public void setTyres(List<Tyre> tyres) {
		this.tyres = tyres;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", tyre=" + tyres + "]";
	}
	
	
}
