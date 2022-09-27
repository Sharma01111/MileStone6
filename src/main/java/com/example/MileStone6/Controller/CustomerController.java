package com.example.MileStone6.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.MileStone6.Exception.UserNotFoundException;
import com.example.MileStone6.User.Customer;
import com.example.MileStone6.Service.CustomerService;

@RestController
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/customer")
	public List<Customer> getAllCustomer()
	{
		List<Customer> customer = customerService.getAllCustomer();
		
		if(customer.size() <= 0)
			throw new UserNotFoundException("Customer details is not present. First Post the data and then recheck Get");
			
	  return customer;
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Integer id)
	{
		Customer customer = customerService.getCustomer(id);
		
		if(customer ==  null)
			throw new UserNotFoundException(" customer Id is not present");
			
	  return customer;
	}
	@RequestMapping(method =RequestMethod.POST , value="/customer" )
	public void addCustomer(@RequestBody Customer customer)
	{
		customerService.addCustomer(customer);
	}
	@RequestMapping(method =RequestMethod.PUT , value="/customer/{id}" )
	public void updateCustomer(@PathVariable Integer id ,@RequestBody Customer customer)
	{
		customerService.updateCustomer(id,customer);
		
		
	}
	@RequestMapping(method =RequestMethod.DELETE , value="/customer/{id}" )
	public void DeleteCustomer(@PathVariable Integer id)
	{
		customerService.deleteCustomer(id);
	}
}