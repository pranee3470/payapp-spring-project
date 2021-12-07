package com.dbs.paymentsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.paymentsapp.model.Reciever;

@Repository
public interface RecieverRepository extends JpaRepository<Reciever, String>{

}
