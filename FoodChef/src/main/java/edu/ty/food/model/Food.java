package edu.ty.food.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import edu.ty.chef.model.Chef;

@Entity
public class Food {
	@Id
	private int id;
	private String name;
    private String type;
    private double price;
    @ManyToOne
    private Chef chef;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Chef getChef() {
		return chef;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", chef=" + chef + "]";
	}
    
    
}
