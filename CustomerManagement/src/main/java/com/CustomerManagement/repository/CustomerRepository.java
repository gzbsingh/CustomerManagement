package com.CustomerManagement.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerManagement.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Page<Customer> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String search, String search2,
			Pageable pageable);
    
}