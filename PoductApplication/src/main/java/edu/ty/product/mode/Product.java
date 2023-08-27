package edu.ty.product.mode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import edu.ty.application.model.Application;

@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private double price;
	private String description;
	@ManyToOne
	private Application application;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", application=" + application + "]";
	}
	
}
