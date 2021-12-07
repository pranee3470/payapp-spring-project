package com.dbs.paymentsapp.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.paymentsapp.model.Transaction;
import com.dbs.paymentsapp.service.TransactionService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(origins="*")
public class TransactionController {
	private static final Logger LOG= LoggerFactory.getLogger(TransactionController.class);
	@Autowired
	TransactionService transactionservice;
	
	@PostMapping("/newtransaction")
	public ResponseEntity<Transaction> initiateTransaction(@RequestBody Transaction transaction) throws IOException{
		LOG.info("controller-initiateTransaction");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Transaction Successfull!");
		return new ResponseEntity<Transaction>(transactionservice.initiateTransaction(transaction),headers,HttpStatus.CREATED);
	}
	
	@GetMapping("/listtransactions")
	public List<Transaction> getTransactions(){
		LOG.info("get Transactions");
		return transactionservice.getTransactions();
	}
	
	

	
	

}
