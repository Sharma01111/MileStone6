package com.example.MileStone6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.MileStone6.User.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{
	

}