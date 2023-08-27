package edu.ty.person.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import edu.ty.socialmedia.model.SocialMedia;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private int age;
	private long phone_number;
	private String email;
	@OneToMany
	private List<SocialMedia> social;
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
	public List<SocialMedia> getSocial() {
		return social;
	}
	public void setSocial(List<SocialMedia> social) {
		this.social = social;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", phone_number=" + phone_number + ", email="
				+ email + ", social=" + social + "]";
	}
	
	
}
