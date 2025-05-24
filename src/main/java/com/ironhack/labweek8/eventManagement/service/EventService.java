package com.ironhack.labweek8.eventManagement.service;

import com.ironhack.labweek8.eventManagement.model.Event;
import com.ironhack.labweek8.eventManagement.repository.EventRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ironhack.labweek8.eventManagement.exception.Exception;

import java.util.List;


@SpringBootApplication
public class EventService {

    private final EventRepository eventRepository;


      public EventService(EventRepository eventRepository) {

          this.eventRepository = eventRepository;
    }

    public Event create(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public Event findById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new Exception("Event not found with id: " + id));
    }


    public Event update(Long id, Event event) {
//        find the event by id
        var existingEvent = eventRepository.findById(id);
//        if we find id, we update the event and return it
        if (existingEvent.isPresent()){
            Event eventToUpdate = existingEvent.get();
            eventToUpdate.setModel(event.getModel());
            return eventRepository.save(eventToUpdate);
//        else we throw and exception
        } else {
            throw new Exception("event not found with id: " + id);
        }
    }



    public void delete(Long id) {
        eventRepository.deleteById(id);
    }
}
