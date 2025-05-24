package com.ironhack.labweek8.rpcompany.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String company;
    private String title;

    @Embedded
    private Name name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="firstName", column=@Column(name ="first_Name")),
            @AttributeOverride(name="middleName", column=@Column(name ="middle_Name")),
            @AttributeOverride(name="lastName", column=@Column(name ="last_Name"))
    })
private Name nameBis;

    public Contact() {

    }


    public Contact(String company, String title, Name name) {
        this.company = company;
        this.title = title;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
