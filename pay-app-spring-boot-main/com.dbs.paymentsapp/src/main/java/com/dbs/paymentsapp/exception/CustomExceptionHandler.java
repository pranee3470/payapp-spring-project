package com.dbs.paymentsapp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<Object> handleCustomerNotFoundException() {
		LOG.error("handleCustomerNotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("Message", "The customer with given ID do not exist.");
		return new ResponseEntity<Object>(headers, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(RecieverNotFoundException.class)
	public ResponseEntity<Object> handleRecieverNotFoundException() {
		LOG.error("handleRecieverNotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("Messsage", "The reciever with given ID do not exist.");
		return new ResponseEntity<Object>(headers, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(InsufficientBalanceException.class)
	public ResponseEntity<Object> handleInsufficientBalanceException() {
		LOG.error("handleInsufficientBalanceException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("Messsage", "Insufficient Balance.");
		return new ResponseEntity<Object>(headers, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(TransactionFailedException.class)
	public ResponseEntity<Object> handleTransactionFailedException() {
		LOG.error("Transaction failed exception");
		HttpHeaders headers = new HttpHeaders();
		headers.add("Messsage", " Name present in sanction list.");
		return new ResponseEntity<Object>( headers, HttpStatus.NOT_FOUND);
	}
	
	
//	@ExceptionHandler(SomeOtherException.class)
//	public ResponseEntity<Object> handleSomeOtherException() {
	// code
//	}
}
