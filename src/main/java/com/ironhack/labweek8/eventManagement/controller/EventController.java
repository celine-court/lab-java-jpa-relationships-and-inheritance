package com.ironhack.labweek8.eventManagement.controller;

import com.ironhack.labweek8.eventManagement.model.Event;
import com.ironhack.labweek8.eventManagement.service.EventService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Event createEvent(@RequestBody Event event){
        return eventService.create(event);

    }

    @GetMapping
    public List<Event> findAllDivisions() {
        return eventService.findAll();
    }

    @GetMapping("/{id}")
    public Event findEventById(@PathVariable Long id) {
        return eventService.findById(id);
    }


    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event event) {
        return eventService.update(id, event);
    }



    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEvent(@PathVariable Long id) {
        eventService.delete(id);
    }

}
