package com.ironhack.labweek8.eventManagement.service;

import com.ironhack.labweek8.eventManagement.model.Guest;
import com.ironhack.labweek8.eventManagement.repository.ConferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceService {

    private final ConferenceRepository conferenceRepository;

    public ConferenceService(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    public Guest create(Guest guest) {
    }

    public List<Guest> findAll() {
    }

    public Guest findById(Long id) {
    }

    public Guest findByDistrict(String district) {
    }

    public Guest update(Long id, Guest guest) {
    }

    public void delete(Long id) {
    }
}


