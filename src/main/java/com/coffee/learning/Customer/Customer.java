package com.coffee.learning.Customer;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Customer {
    private   Long id;
    @NotBlank
    private   String name ;
    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    private final String password ;
@NotBlank
@Email
    private final String email;


    public Customer(Long id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
