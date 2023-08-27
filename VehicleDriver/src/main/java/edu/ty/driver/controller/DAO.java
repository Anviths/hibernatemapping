package edu.ty.driver.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.ty.driver.model.Driver;
import edu.ty.vechile.model.Vehicle;

public class DAO {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insetVehicle() {
		Vehicle vehicle=new Vehicle();
		vehicle.setId(10);
		vehicle.setVehicleNumber("ka05a455");
		vehicle.setCatageory("auto");
		vehicle.setMilage(18);
		Driver driver=new Driver();
		driver.setId(1001);
		driver.setAge(35);
		driver.setDrivingLicenceNumber(1236457225585l);
		driver.setName("ramu");
		
		
		vehicle.setDriver(driver);
		vehicle.setNumberofSeats(5);
	
		entityTransaction.begin();
		entityManager.persist(driver);
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
