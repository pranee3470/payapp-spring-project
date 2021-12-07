package com.dbs.paymentsapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.dbs.paymentsapp.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
	public abstract List<Customer> findByName(String name);

}