package edu.ty.person.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoterId {

	@Id
	private int id;
	private String voterNumber;
	private String Constiuency;
	private int pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVoterNumber() {
		return voterNumber;
	}
	public void setVoterNumber(String voterNumber) {
		this.voterNumber = voterNumber;
	}
	public String getConstiuency() {
		return Constiuency;
	}
	public void setConstiuency(String constiuency) {
		Constiuency = constiuency;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "VoterId [id=" + id + ", voterNumber=" + voterNumber + ", Constiuency=" + Constiuency + ", pincode="
				+ pincode + "]";
	}
	
}
