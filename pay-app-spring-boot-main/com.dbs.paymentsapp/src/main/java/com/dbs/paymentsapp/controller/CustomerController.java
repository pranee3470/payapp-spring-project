package com.dbs.paymentsapp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.paymentsapp.model.Customer;
import com.dbs.paymentsapp.service.CustomerService;



@RestController
@RequestMapping("/pay")
@CrossOrigin(origins="*")
public class CustomerController {

	@Autowired
	CustomerService customerservice;
	
	Logger LOG =LoggerFactory.getLogger(CustomerController.class);
	
	//#1. CustomerVerification
	//http://localhost:8080/pay/getccustomerID
	@GetMapping("/getc/{customerID}")
	public Customer getCustomerDetails(@PathVariable(name="customerID") String c) {
		LOG.info("customerID verification");
		return customerservice.getCustomerDetails(c);
	}
}

