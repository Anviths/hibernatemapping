package edu.ty.country.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import edu.ty.president.model.President;

@Entity
public class Country {
@Id
	private int id;
	private String name;
	private String continent;
	private int area;
	
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
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", continent=" + continent + ", area=" + area + "]";
	}
	
	
	
}
