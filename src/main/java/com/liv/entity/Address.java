package com.liv.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String zipCode;

    @ManyToOne(cascade = CascadeType.ALL)
    private Person person;

    public Address(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }
}
