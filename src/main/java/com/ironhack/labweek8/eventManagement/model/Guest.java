package com.ironhack.labweek8.eventManagement.model;

import jakarta.persistence.Embeddable;
import com.ironhack.labweek8.eventManagement.model.enums.StatusGuest;
import jakarta.persistence.Entity;

import jakarta.persistence.*;


@Entity
@Embeddable
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @Enumerated(EnumType.STRING)
    private StatusGuest statusGuest;



    public Guest() {

    }

    public Guest( String name, StatusGuest statusGuest) {
        this.name = name;
        this.statusGuest = statusGuest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusGuest getStatusGuest() {
        return statusGuest;
    }

    public void setStatusGuest(StatusGuest statusGuest) {
        this.statusGuest = statusGuest;
    }
}
