package com.CustomerManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerManagement.models.Customer;
import com.CustomerManagement.repository.CustomerRepository;

@Service
public class CustomerService {

	// This @Autowired annotation injects the CustomerRepository bean into this service.
	  @Autowired
	    private CustomerRepository customerRepository;

	  /**
	     * Create a new customer.
	     *
	     * @param customer The customer data to be created.
	     * @return The created customer.
	     */
	    public Customer createCustomer(Customer customer) {
	        return customerRepository.save(customer);
	    }
	    /**
	     * Update an existing customer.
	     *
	     * @param customerId The ID of the customer to be updated.
	     * @param customer   The updated customer data.
	     * @return The updated customer if found, otherwise null.
	     */
	    public Customer updateCustomer(Long customerId, Customer customer) {
	        Optional<Customer> existingCustomerOptional = customerRepository.findById(customerId);

	        if (existingCustomerOptional.isPresent()) {
	            Customer existingCustomer = existingCustomerOptional.get();
	            existingCustomer.setFirstName(customer.getFirstName());
	            existingCustomer.setLastName(customer.getLastName());
	            existingCustomer.setStreet(customer.getStreet());
	            existingCustomer.setAddress(customer.getAddress());
	            existingCustomer.setCity(customer.getCity());
	            existingCustomer.setState(customer.getState());
	            existingCustomer.setEmail(customer.getEmail());
	            existingCustomer.setPhone(customer.getPhone());

	            return customerRepository.save(existingCustomer);
	        } else {
	            
	            return null;
	        }
	    }

	    /**
	     * Get a list of all customers.
	     *
	     * @return The list of all customers.
	     */
	    public List<Customer> getAllCustomers() {
	        return customerRepository.findAll();
	    }

	    /**
	     * Get a single customer by ID.
	     *
	     * @param customerId The ID of the customer to be retrieved.
	     * @return The customer if found, otherwise an empty Optional.
	     */
	    public Optional<Customer> getCustomerById(Long customerId) {
	        return customerRepository.findById(customerId);
	    }

	    /**
	     * Delete a customer by ID.
	     *
	     * @param customerId The ID of the customer to be deleted.
	     */
	    public void deleteCustomer(Long customerId) {
	        customerRepository.deleteById(customerId);
	    }
}
