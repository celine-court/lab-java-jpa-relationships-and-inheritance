package com.ironhack.labweek8.nurseAssociation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ironhack.labweek8.nurseAssociation.model.enums.StatusMember;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Entity
@Embeddable
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String memberName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate renewalDate;

    @Enumerated(EnumType.STRING)
    private StatusMember statusMember;

    @ManyToOne
    @JsonIgnore
    private Division division;

    public Member() {

    }


    public Member(String memberName, LocalDate renewalDate, StatusMember statusMember) {
        this.memberName = memberName;
        this.renewalDate = renewalDate;
        this.statusMember = statusMember;
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

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public StatusMember getStatusMember() {
        return statusMember;
    }

    public void setStatusMember(StatusMember statusMember) {
        this.statusMember = statusMember;
    }
}
