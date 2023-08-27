package edu.ty.doctor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.doctor.model.Doctor;
import edu.ty.patient.model.Patient;

public class DAO {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void addDoctor() {
		Doctor doctor=new Doctor();
		doctor.setId(1);
		doctor.setName("govardhan");
		doctor.setLicenseNumber("dov343");
		doctor.setSpecality("cardio");
		List<Patient> patients=new ArrayList<Patient>();
		Patient patient1=new Patient();
		patient1.setId(101);
		patient1.setName("gagan");
		patient1.setAge(55);
		patient1.setDisease("heart");
		Patient patient2=new Patient();
		patient2.setId(102);
		patient2.setName("puttana");
		patient2.setAge(55);
		patient2.setDisease("heart");
		patients.add(patient2);
		patients.add(patient1);
		
		doctor.setPatients(patients);
		entityTransaction.begin();
		entityManager.persist(patient1);
		entityManager.persist(patient2);
		entityManager.persist(doctor);
		entityTransaction.commit();
	}
	public Doctor findDoctorById(int id) {
		return entityManager.find(Doctor.class, id);
		
		
	}
	public void updateNameById(int id,String name) {
		Doctor doctor=findDoctorById(id);
		if(doctor!=null) {
			doctor.setName(name);
			entityTransaction.begin();
			entityManager.merge(doctor);
			entityTransaction.commit();
			System.out.println("updated");
		}
		else
			System.out.println("no record found");
	}
	public void deleteDocorById(int id) {
		Doctor doctor=findDoctorById(id);
		if(doctor!=null) {
			entityTransaction.begin();
			entityManager.remove(doctor);
			entityTransaction.commit();
			System.out.println("deleted");
		}
		else
			System.out.println("no record found");
	}
}
