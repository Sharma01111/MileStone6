package com.example.MileStone6.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MileStone6.User.Customer;
import com.example.MileStone6.Repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	public CustomerRepository customerRepo;

public List<Customer> getAllCustomer() {
	// TODO Auto-generated method stub
	List<Customer> customer =new ArrayList<>();
	customerRepo.findAll().forEach(customer::add);
	return customer;
}

public Customer getCustomer(Integer id) {
	// TODO Auto-generated method stub
     try
     {
	return customerRepo.findById(id).get();
     }
     catch(Exception e)
     {
    	 return null;
     }
}

public void addCustomer(Customer customer) {
	customerRepo.save(customer);
	// TODO Auto-generated method stub
	
}

public void updateCustomer(Integer id, Customer customer) {
	// TODO Auto-generated method stub
	customerRepo.save(customer);
	}

public void deleteCustomer(Integer id) {
	// TODO Auto-generated method stub
	customerRepo.deleteById(id);
	}
}