package com.example.springbootcustomer.repository;

import com.example.springbootcustomer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
