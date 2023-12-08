package com.coffee.learning.Customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository(value = "fake")
public class CustomerRepositoryFake implements ICustomerRepository {
    @Override
    public List<Customer> GetCustomers() {

        return Arrays.asList(
                new Customer(1L,"from the fake repo")
        );

    }
}
