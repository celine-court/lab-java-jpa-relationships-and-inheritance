package com.ironhack.labweek8.eventManagement.repository;


import com.ironhack.labweek8.eventManagement.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
