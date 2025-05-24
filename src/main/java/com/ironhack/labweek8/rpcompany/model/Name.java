package com.ironhack.labweek8.rpcompany.model;

import com.ironhack.labweek8.rpcompany.model.enums.NameSalutation;

import jakarta.persistence.*;
import jakarta.persistence.Entity;


@Entity
@Embeddable
public class Name{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String firstName;
    private String middleName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private NameSalutation nameSalutation;

    public Name() {

    }

    public Name(String firstName, String middleName, String lastName, NameSalutation nameSalutation) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nameSalutation = nameSalutation;
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public NameSalutation getNameSalutation() {
        return nameSalutation;
    }

    public void setNameSalutation(NameSalutation nameSalutation) {
        this.nameSalutation = nameSalutation;
    }
}
