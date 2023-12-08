package com.coffee.learning.Customer;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    private   Long id;
    private   String name ;
    private final String password ;


    public Customer(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

@JsonIgnore // TO NOT SHOW IT  L CLIENT
    public String getPassword() {
        return password;
    }




@JsonProperty("CustomerId") // to change l'affichage name
    public Long getId() {
        return id;
    }

    // The getter are responsible for sending the properties (this is how the library jackson working )
  //  public Long getIdCustomer() {
    //    return id;
    //}

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
