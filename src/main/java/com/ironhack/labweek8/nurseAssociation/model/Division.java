package com.ironhack.labweek8.nurseAssociation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;


@Entity

public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String district;
    private String president;

    @OneToMany(mappedBy = "division", fetch = FetchType.LAZY)
    private List<Member> members = new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    private Association association;



    public Division(String divisionA, String districtH, String ptJohnson, Member member) {

    }

    public Division(String name, String district, String president, Association association) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.association = association;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
}
