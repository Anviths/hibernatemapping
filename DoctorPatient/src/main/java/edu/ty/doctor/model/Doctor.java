package edu.ty.doctor.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import edu.ty.patient.model.Patient;

@Entity
public class Doctor {
@Id
private int id;
private String name;
private String specality;
private String licenseNumber;
@ManyToMany
List<Patient> patients;
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
public String getSpecality() {
	return specality;
}
public void setSpecality(String specality) {
	this.specality = specality;
}
public String getLicenseNumber() {
	return licenseNumber;
}
public void setLicenseNumber(String licenseNumber) {
	this.licenseNumber = licenseNumber;
}
public List<Patient> getPatients() {
	return patients;
}
public void setPatients(List<Patient> patients) {
	this.patients = patients;
}
@Override
public String toString() {
	return "Doctor [id=" + id + ", name=" + name + ", specality=" + specality + ", licenseNumber=" + licenseNumber
			+ ", patients=" + patients + "]";
}

}
