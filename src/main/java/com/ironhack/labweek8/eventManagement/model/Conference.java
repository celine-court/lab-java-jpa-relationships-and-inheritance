package com.ironhack.labweek8.eventManagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ironhack.labweek8.eventManagement.model.enums.StatusGuest;
import com.ironhack.labweek8.nurseAssociation.model.Association;
import com.ironhack.labweek8.nurseAssociation.model.Member;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DurationFormat;
import jakarta.persistence.Entity;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Conference extends Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "conference", fetch = FetchType.LAZY)
    private List<Speaker> speakers = new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    private Event event;


    public Conference() {

   speakers = new ArrayList<>();
    }

    public Conference(List<Speaker> speakers, Event event) {
        this.speakers = speakers;
        this.event = event;
    }

    public Conference(String title, Duration duration, String location, LocalDateTime date, List<Guest> guests, List<Speaker> speakers, Event event) {
        super(title, duration, location, date, guests);
        this.speakers = speakers;
        this.event = event;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
