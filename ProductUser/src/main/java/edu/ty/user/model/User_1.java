package edu.ty.user.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import edu.ty.product.mode.Product;

@Entity
public class User_1 {

	@Id
	private int id;
	private String name;
	private int age;
	private long phone_number;
	private String email;

	@ManyToMany
	private List<Product> products;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "User_1 [id=" + id + ", name=" + name + ", age=" + age + ", phone_number=" + phone_number + ", email="
				+ email + ", products=" + products + "]";
	}
	
}
