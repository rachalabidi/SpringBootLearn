package com.coffee.learning.Customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Bean
   CommandLineRunner commandLineRunner(){
       return args ->{
System.out.println("command line runner whooww");
       };

   }
@Bean
    ICustomerRepository customerRepository(){
    System.out.println("useFakeCustomerRepo IS " +useFakeCustomerRepo   );

    return useFakeCustomerRepo ?
    new CustomerRepositoryFake():
    new CustomerRepository();
}

}
