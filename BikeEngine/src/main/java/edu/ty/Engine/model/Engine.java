package edu.ty.Engine.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {

	@Id
	private int id;
	private String engineNumber;
	private String type;
	private int cc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Engine [id=" + id + ", engineNumber=" + engineNumber + ", type=" + type + ", cc=" + cc + "]";
	}
	
}
