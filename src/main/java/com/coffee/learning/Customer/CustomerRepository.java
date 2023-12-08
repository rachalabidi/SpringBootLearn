package com.coffee.learning.Customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;



public class CustomerRepository implements ICustomerRepository {
    @Override
     public List<Customer> GetCustomers() {

        return Arrays.asList(
                new Customer(1L, "rasha" , "password123"),
                new Customer(2L, "Malak" , "password123"),
                new Customer(3L, "Oussama" , "password123")
        );

    }
}
