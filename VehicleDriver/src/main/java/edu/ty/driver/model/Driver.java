package edu.ty.driver.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

	@Id
	private int id;
	private String name;
	private long drivingLicenceNumber;
	private int age;
	
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
	public long getDrivingLicenceNumber() {
		return drivingLicenceNumber;
	}
	public void setDrivingLicenceNumber(long drivingLicenceNumber) {
		this.drivingLicenceNumber = drivingLicenceNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", drivingLicenceNumber=" + drivingLicenceNumber + ", age=" + age
				+  "]";
	}
	
	
	
}
