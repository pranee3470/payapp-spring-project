package com.dbs.paymentsapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="customer_table")
public class Customer {
	
	
	@Id
	private String customerID;
	@Column
	private String name;
	@Column
	private double clearBalance;
	@Column
	private String overdraft;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerID, String name, double clearBalance, String overdraft) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.clearBalance = clearBalance;
		this.overdraft = overdraft;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}
	public String getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + ", clearBalance=" + clearBalance
				+ ", overdraft=" + overdraft + "]";
	}
	

}
