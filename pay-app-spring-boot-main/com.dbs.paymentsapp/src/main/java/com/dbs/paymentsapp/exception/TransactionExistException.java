package com.dbs.paymentsapp.exception;

public class TransactionExistException extends Exception {
	
	private static final long serialVersionUID = 3989563717557100877L;
	public TransactionExistException() {
		super();
	}
	public TransactionExistException(String message)
	{
		super(message);
	}

}
