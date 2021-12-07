package com.dbs.paymentsapp.exception;

public class TransactionFailedException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2052803173350514003L;
	public TransactionFailedException() {
		super();
	}
	public TransactionFailedException(String message) {
		super(message);
	}

	
	
}
