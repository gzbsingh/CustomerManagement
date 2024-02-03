package com.CustomerManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerManagement.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}