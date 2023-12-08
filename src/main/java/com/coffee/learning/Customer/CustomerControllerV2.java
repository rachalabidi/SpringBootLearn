package com.coffee.learning.Customer;

import com.coffee.learning.Exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RequestMapping(path = "api/v2/customers")
@RestController

public class CustomerControllerV2 {
    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> GetCustomers() {
        return customerService.GetCustomers();

    }

    @GetMapping(path = "{customerId}")
    public Customer GetCustomer(@PathVariable("customerId") Long id) {

        return customerService.GetCustomer(id);
    }
    @GetMapping(path = "{customerId}/exception")
    public Customer GetCustomerException(@PathVariable("customerId") Long id) {

        throw    new ApiRequestException(
                "ApiRequestException for Customer "+id
        );
    }
    @PostMapping
    void createNewCustomer(@Valid @RequestBody  Customer customer) {
        System.out.println("Post request.....");
        System.out.println(customer);

    }


    @PutMapping
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("Update request.....");
        System.out.println(customer);

    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {

        System.out.println("deleted customer "+ id);

    }

}
