package com.dbs.paymentsapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="transaction_table")
public class Transaction {
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int transaction_id;
   @OneToOne
   @JoinColumn(name="customer_ID")
   private Customer customer;
   @OneToOne
   @JoinColumn(name="bic")
   private Reciever reciever;
   @Override
public String toString() {
	return "Transaction [transaction_id=" + transaction_id + ", customer=" + customer + ", reciever=" + reciever
			+ ", reciever_name=" + reciever_name + ", reciever_accnum=" + reciever_accnum + ", transfer_date="
			+ transfer_date + ", transfer_type=" + transfer_type + ", message_code=" + message_code + ", amount="
			+ amount + ", transfer_fee=" + transfer_fee + "]";
}
public Transaction(int transaction_id, Customer customer, Reciever reciever, String reciever_name,
		String reciever_accnum, LocalDate transfer_date, String transfer_type, String message_code, double amount,
		double transfer_fee) {
	super();
	this.transaction_id = transaction_id;
	this.customer = customer;
	this.reciever = reciever;
	this.reciever_name = reciever_name;
	this.reciever_accnum = reciever_accnum;
	this.transfer_date = transfer_date;
	this.transfer_type = transfer_type;
	this.message_code = message_code;
	this.amount = amount;
	this.transfer_fee = transfer_fee;
}
public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public Reciever getReciever() {
	return reciever;
}

public void setReciever(Reciever reciever) {
	this.reciever = reciever;
}
@Column
   private String reciever_name;
   @Column
   private String reciever_accnum;
   @Column 
   private LocalDate transfer_date;
   @Column
   private String transfer_type;
   @Column
   private String message_code;
   @Column
   private double amount;
   @Column
   private double transfer_fee;
public Transaction() {
	super();
	// TODO Auto-generated constructor stub
}

public int getTransaction_id() {
	return transaction_id;
}
public void setTransaction_id(int transaction_id) {
	this.transaction_id = transaction_id;
}



public String getReciever_name() {
	return reciever_name;
}
public void setReciever_name(String reciever_name) {
	this.reciever_name = reciever_name;
}
public String getReciever_accnum() {
	return reciever_accnum;
}
public void setReciever_accnum(String reciever_accnum) {
	this.reciever_accnum = reciever_accnum;
}
public LocalDate getTransfer_date() {
	return transfer_date;
}
public void setTransfer_date(LocalDate transfer_date) {
	this.transfer_date = transfer_date;
}
public String getTransfer_type() {
	return transfer_type;
}
public void setTransfer_type(String transfer_type) {
	this.transfer_type = transfer_type;
}
public String getMessage_code() {
	return message_code;
}
public void setMessage_code(String message_code) {
	this.message_code = message_code;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public double getTransfer_fee() {
	return transfer_fee;
}
public void setTransfer_fee(double transfer_fee) {
	this.transfer_fee = transfer_fee;
}

   
   
   
   
	

}
