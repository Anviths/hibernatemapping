package edu.ty.tyre.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Tyre {
	@Id
	private int id;
	private String brand;
	private int km;
	private double price;
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
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Tyre [id=" + id + ", brand=" + brand + ", km=" + km + ", price=" + price + "]";
	}
	
}
