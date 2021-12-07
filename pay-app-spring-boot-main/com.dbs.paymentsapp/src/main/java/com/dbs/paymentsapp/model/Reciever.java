package com.dbs.paymentsapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Reciever {
	
	@Id
	private String bic;
	@Column
	private String bankName;
	
	public Reciever() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reciever(String bic, String bankName) {
		super();
		this.bic = bic;
		this.bankName = bankName;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Reciever [bic=" + bic + ", bankName=" + bankName + "]";
	}
	

}
