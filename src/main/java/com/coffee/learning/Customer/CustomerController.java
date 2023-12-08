package com.coffee.learning.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(path = "api/v1/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    public List<Customer> GetCustomers() {

        return customerService.GetCustomers();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer) {
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
