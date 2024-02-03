   package com.CustomerManagement.models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String street;
    private String address;
    private String city;
    private String state;
    private String email;
    private String phone;

}
