package edu.ty.Battery.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Battery {
	@Id
	private int id;
		private String brand;
		private int capacity;
		private String type;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		@Override
		public String toString() {
			return "Battery [id=" + id + ", brand=" + brand + ", capacity=" + capacity + ", type=" + type + "]";
		}
		
}
