package com.dbs.paymentsapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.paymentsapp.exception.CustomerNotFoundException;
import com.dbs.paymentsapp.model.Customer;
import com.dbs.paymentsapp.repository.CustomerRepository;




@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	//#1.returns customer details
	public Customer getCustomerDetails(String customerID) {
		Optional<Customer> customeroptional=customerRepository.findById(customerID);
		if (customeroptional.isPresent())
			return customeroptional.get();
		throw new CustomerNotFoundException("The Customer with given ID do not exist");
	
	}
}
