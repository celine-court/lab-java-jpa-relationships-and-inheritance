package com.ironhack.labweek8.eventManagement.repository;


import com.ironhack.labweek8.eventManagement.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {

}

