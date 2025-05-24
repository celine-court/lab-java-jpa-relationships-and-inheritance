package com.ironhack.labweek8.eventManagement.repository;


import com.ironhack.labweek8.eventManagement.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
