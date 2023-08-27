package edu.ty.mobile.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import edu.ty.application.model.Application;

@Entity
public class Mobile {
	@Id
	private int id;
	private String brand;
	private String model;
	private double price;

	@OneToMany
	private List<Application> applications;

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", applications="
				+ applications + "]";
	}

}
