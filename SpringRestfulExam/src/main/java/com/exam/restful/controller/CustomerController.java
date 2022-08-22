package com.exam.restful.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.restful.dao.CustomerTable;
import com.exam.restful.model.Customer;


@RestController

public class CustomerController

{

 @Autowired

 CustomerTable repo;

 @PostMapping(path="/customer",consumes= {"application/json"})

 public Customer addCustomer(@RequestBody Customer customer)

 {

 repo.save(customer);

 return customer;

 }

 @GetMapping(path="/customers")

 public List<Customer> getCustomer()

 {

 return repo.findAll();

 }

 @RequestMapping("/customer/{customerId}")

 public Optional<Customer> getCustomer(@PathVariable("customerId")int customerId)

 {

 return repo.findById(customerId);

 }

@DeleteMapping("/customer/{customerId}")

 public String deleteCustomer(@PathVariable int customerId)

 {

 Customer a = repo.getOne(customerId);

 repo.delete(a);

 return "deleted";

 }

 @PutMapping(path="/customer",consumes= {"application/json"})

 public Customer saveOrUpdateCustomer(@RequestBody Customer customer)

 {

 repo.save(customer);

 return customer;

 }

}


