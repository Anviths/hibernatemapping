package edu.ty.vechile.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import edu.ty.driver.model.Driver;

@Entity
public class Vehicle {
	@Id
private int id;
	private String vehicleNumber;
	private String catageory;
	private int numberofSeats;
   private double milage;
	@OneToOne
	private Driver driver;
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getCatageory() {
		return catageory;
	}
	public void setCatageory(String catageory) {
		this.catageory = catageory;
	}
	public int getNumberofSeats() {
		return numberofSeats;
	}
	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleNumber=" + vehicleNumber + ", catageory=" + catageory
				+ ", numberofSeats=" + numberofSeats + ", milage=" + milage + ", driver=" + driver + "]";
	}
	
	
	
}
