package com.coffee.learning.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerService {
 private final ICustomerRepository customerRepository;
@Autowired
    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> GetCustomers() {

        return  customerRepository.GetCustomers() ;
    }

    public Customer GetCustomer( Long id ) {

        return customerRepository.GetCustomers()
                .stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("customer with "+id+ " not found "));
    }
}
