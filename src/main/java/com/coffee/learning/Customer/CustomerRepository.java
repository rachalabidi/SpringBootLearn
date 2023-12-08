package com.coffee.learning.Customer;

import java.util.Arrays;
import java.util.List;



public class CustomerRepository implements ICustomerRepository {
    @Override
     public List<Customer> GetCustomers() {

        return Arrays.asList(
                new Customer(1L, "rasha" , "password123", "email@gmail.com"),
                new Customer(2L, "Malak" , "password123", "email@gmail.com"),
                new Customer(3L, "Oussama" , "password123", "email@gmail.com")
        );

    }
}
