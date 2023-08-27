package edu.ty.fuelstation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FuelStation {
	@Id
	private int id;
	private String name;
	private String gstNumber;
	private String brand;
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
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "FuelStation [id=" + id + ", name=" + name + ", gstNumber=" + gstNumber + ", brand=" + brand + "]";
	}

	
}
