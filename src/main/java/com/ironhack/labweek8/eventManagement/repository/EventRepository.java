package com.ironhack.labweek8.eventManagement.repository;

import com.ironhack.labweek8.eventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.ScopedValue;


@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    <T> ScopedValue<T> findByLicensePlateIgnoreCase(String licensePlate);
}
