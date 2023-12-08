package com.coffee.learning.Customer;

import java.util.Arrays;
import java.util.List;

public class CustomerRepositoryFake implements ICustomerRepository {
    @Override
    public List<Customer> GetCustomers() {

        return Arrays.asList(
                new Customer(1L,"from the fake repo" , "password123", "email@gmail.com")
        );

    }
}
