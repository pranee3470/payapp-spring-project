package com.dbs.paymentsapp.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.paymentsapp.exception.RecieverNotFoundException;
import com.dbs.paymentsapp.model.Reciever;
import com.dbs.paymentsapp.repository.RecieverRepository;




@Service
public class RecieverService {
	

	@Autowired
	RecieverRepository recieverRepository;
	@Autowired
	NameChecker namechecker;
	
	
	
	
	//#2.returns reciever details
		public Reciever getRecieverDetails(String bic) {
			Optional<Reciever> recieveroptional=recieverRepository.findById(bic);
			if (recieveroptional.isPresent())
				return recieveroptional.get();
			throw new RecieverNotFoundException("The reciever with given ID do not exist");
		
		}




		public boolean checkName(String name) throws IOException {
			// TODO Auto-generated method stub
			if(namechecker.checker(name))
				return false;
			return true;
		}

		
	
		
		
		
			
				
				
				
				 
		
			

		
}

	
	


