package edu.ty.fuelstation.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.fuelstation.model.FuelStation;
import edu.ty.vechile.model.Vehicle;

public class DAO {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void addVehicle() {
		Vehicle vehicle=new Vehicle();
		vehicle.setId(11);
		vehicle.setVehicleNumber("ka18a455");
		vehicle.setCatageory("bus");
		vehicle.setMilage(10);
		
		FuelStation station1=new FuelStation();
		station1.setId(103);
		station1.setName("manjunatha petrolpump");
		station1.setBrand("shell");
		station1.setGstNumber("xreea1236");
		FuelStation station2=entityManager.find(FuelStation.class, 102);
		
		List<FuelStation> fuelStations=new ArrayList<FuelStation>();
		fuelStations.add(station2);
		fuelStations.add(station1);
		vehicle.setStations(fuelStations);
		entityTransaction.begin();
		
		entityManager.persist(station1);
//		entityManager.persist(station2);
		entityManager.persist(vehicle);
		entityTransaction.commit();
		
	}
	public Vehicle findVehicleByid(int id) {
		return entityManager.find(Vehicle.class, id);
		
	}
	public void updateMilageById(int id,double milage) {
		Vehicle vehicle=findVehicleByid(id);
		if(vehicle!=null) {
			
			vehicle.setMilage(milage);
			entityTransaction.begin();
			entityManager.merge(vehicle);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	public void deleteVehicleById(int id) {
		Vehicle vehicle=findVehicleByid(id);
		if(vehicle!=null) {
			entityTransaction.begin();
			entityManager.remove(vehicle);
			entityTransaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
}
