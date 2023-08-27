package edu.ty.chef.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chef {
@Id
private int id;
private String name;
private int age;
private String speciality;
private double experienceYears;
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
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
public double getExperienceYears() {
	return experienceYears;
}
public void setExperienceYears(double experienceYears) {
	this.experienceYears = experienceYears;
}
@Override
public String toString() {
	return "Chef [name=" + name + ", age=" + age + ", speciality=" + speciality + ", experienceYears=" + experienceYears
			+ "]";
}

}
