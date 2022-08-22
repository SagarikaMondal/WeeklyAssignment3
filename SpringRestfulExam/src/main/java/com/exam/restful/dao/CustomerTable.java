package com.exam.restful.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.restful.model.Customer;

public interface CustomerTable extends JpaRepository<Customer,Integer>{

}
