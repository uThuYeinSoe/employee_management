package com.employee.employee_entry.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" , nullable = false , unique = true)
    private int addressId;
    @Column(name="street_name",nullable = false)
    private String streetName;
    @Column(name="house_number" , nullable = false)
    private String houseNumber;
    @Column(name="zip_code")
    private String zipCode;
}
