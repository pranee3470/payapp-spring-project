package com.dbs.paymentsapp.service;

import java.io.IOException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.dbs.paymentsapp.exception.InsufficientBalanceException;
import com.dbs.paymentsapp.exception.TransactionFailedException;
import com.dbs.paymentsapp.model.Customer;
import com.dbs.paymentsapp.model.Transaction;
import com.dbs.paymentsapp.repository.CustomerRepository;
import com.dbs.paymentsapp.repository.TransactionRepository;
@Service
public class TransactionService {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
    TransactionRepository transactionrepository;
	@Autowired
	NameChecker namechecker;
    public static final Logger LOG= LoggerFactory.getLogger(TransactionService.class);
    
    public void updateBalanceAmount(String customerID, double amount) {
		Optional<Customer> customero=customerRepository.findById(customerID);
			Customer customer=customero.get();
			if(amount>customer.getClearBalance()&& customer.getOverdraft().equalsIgnoreCase("Yes") || amount<customer.getClearBalance()) {
				customer.setClearBalance(customer.getClearBalance()-amount-(amount*0.0025));
				customerRepository.save(customer);
			
			}
			else if(amount>customer.getClearBalance()&& customer.getOverdraft().equalsIgnoreCase("No")) {
				 throw new InsufficientBalanceException("Insufficent Balance");
			}
			
		}
	public Transaction initiateTransaction(Transaction transaction) throws IOException {
	    if(namechecker.checker(transaction.getReciever_name()))
	    {
	    	updateBalanceAmount(transaction.getCustomer().getCustomerID(),transaction.getAmount());
	 
	    		return transactionrepository.save(transaction);
	    }


	    else throw new TransactionFailedException("Transaction Failed");

}
	public List<Transaction> getTransactions() {
		// TODO Auto-generated method stub
		return transactionrepository.findAll();
		
	}
	
	
}
