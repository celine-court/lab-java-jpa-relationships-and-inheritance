package com.ironhack.labweek8.eventManagement.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Embeddable;



@Entity
@Embeddable
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String memberName;
    private Integer presentationDuration;

    public Speaker() {

    }

    public Speaker(String memberName, Integer presentationDuration) {
        this.memberName = memberName;
        this.presentationDuration = presentationDuration;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Integer getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Integer presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
