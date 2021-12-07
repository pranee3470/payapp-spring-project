package com.dbs.paymentsapp.exception;

public class InsufficientBalanceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8646125329657416984L;
	public InsufficientBalanceException() {
		super();
}	
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
