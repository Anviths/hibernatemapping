package edu.ty.president.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import edu.ty.country.model.Country;
@Entity
public class President {
	@Id
	private int id;
	private String name;
	private int age;
	private long phone;
	@OneToOne
	private Country country;
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "President [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", country=" + country
				+ "]";
	}
	
	
}
