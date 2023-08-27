package edu.ty.vechile.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import edu.ty.fuelstation.model.FuelStation;

@Entity
public class Vehicle {
	@Id
private int id;
	private String vehicleNumber;
	private String catageory;
	private int numberofSeats;
   private double milage;
	@ManyToMany
	private List<FuelStation> stations;
	
	public List<FuelStation> getStations() {
		return stations;
	}
	public void setStations(List<FuelStation> stations) {
		this.stations = stations;
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
				+ ", numberofSeats=" + numberofSeats + ", milage=" + milage + "]";
	}
	
}
