package com.ironhack.labweek8.nurseAssociation.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;


    @OneToMany(mappedBy = "association", fetch = FetchType.LAZY)
    private List<Division> divisions = new ArrayList<>();

    public Association(String nurseAssociationOfSpain, String division1) {

    }


    public Association(String name, List<Division> divisions) {
        this.name = name;
        this.divisions = divisions;
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

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }
}
