package com.dbs.paymentsapp.exception;

public class CustomerNotFoundException extends RuntimeException{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -8890243887830267905L;
	public CustomerNotFoundException() {
    	super();
    }
    public CustomerNotFoundException(String message) {
    	super(message);
    }
}
