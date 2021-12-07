package com.dbs.paymentsapp.exception;

public class RecieverNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3989563717557100877L;
	public RecieverNotFoundException() {
		super();
	}
	public RecieverNotFoundException(String message)
	{
		super(message);
	}

}
