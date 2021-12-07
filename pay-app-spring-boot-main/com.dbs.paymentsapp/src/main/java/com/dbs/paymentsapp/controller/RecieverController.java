package com.dbs.paymentsapp.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.paymentsapp.model.Reciever;
import com.dbs.paymentsapp.service.RecieverService;



@RestController
@RequestMapping("/pay")
@CrossOrigin(origins="*")
public class RecieverController {

	@Autowired
	RecieverService recieverservice;
	
	Logger LOG =LoggerFactory.getLogger(RecieverController.class);
	
	//#2. BICVerification
	//htpp://localhost:8080/pay/get-BIC/bic
	@GetMapping("get-BIC/{bic}")
	public Reciever getRecieverDetails(@PathVariable(name="bic") String bic) {
	   LOG.info("bank id verification");
		return recieverservice.getRecieverDetails(bic);
		
	}
	@GetMapping("name-check/{name}")
	public boolean checkName(@PathVariable(name="name") String name) throws IOException {
	   LOG.info("Name Verification");
		return recieverservice.checkName(name);
		
	}
	}
	
	
	
		
		
	
	
			
			
			
			
			
			
			
			
			
			
	




