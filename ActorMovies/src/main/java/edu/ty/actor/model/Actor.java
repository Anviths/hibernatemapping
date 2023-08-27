package edu.ty.actor.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {

	@Id
	private int id;
	private int age;
	private String name;
	private Gender gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}
