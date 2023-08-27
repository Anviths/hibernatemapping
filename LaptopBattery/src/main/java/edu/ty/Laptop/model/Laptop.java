package edu.ty.Laptop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import edu.ty.Battery.model.Battery;

@Entity
public class Laptop {
	@Id
private int id;
	private String brand;
	private int ram;
	private double price;
	@OneToOne
	private Battery battery;
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", ram=" + ram + ", price=" + price + ", battery=" + battery
				+ "]";
	}
	
}
