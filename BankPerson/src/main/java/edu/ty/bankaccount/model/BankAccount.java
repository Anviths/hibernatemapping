package edu.ty.bankaccount.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import edu.ty.person.model.Person;
@Entity
public class BankAccount {
	@Id
	private int id;
	
	private String accountNumber;
    private String bankName;
    private double balance;
    @ManyToOne
    private Person person;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", accountNumber=" + accountNumber + ", bankName=" + bankName + ", balance="
				+ balance + ", person=" + person + "]";
	}
	
    
    
}
