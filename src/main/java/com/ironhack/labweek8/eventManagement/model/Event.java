package com.ironhack.labweek8.eventManagement.model;


import com.ironhack.labweek8.eventManagement.model.Conference;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private Duration duration;
    private String location;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime date;


    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
    private List<Guest> guests = new ArrayList<>();


    /*@Embedded
    private Guest guest;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="name", column=@Column(name ="nameBis")),
            @AttributeOverride(name="status", column=@Column(name ="statusBis")),
    })
private Guest guestBis;
    */

    public Event() {

        guests = new ArrayList<>();
    }

    public Event(String title, Duration duration, String location, LocalDateTime date, List<Guest> guests) {
        this.title = title;
        this.duration = duration;
        this.location = location;
        this.date = date;
        this.guests = guests;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
