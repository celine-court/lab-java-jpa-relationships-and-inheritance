package com.ironhack.labweek8.nurseAssociation.repository;

import com.ironhack.labweek8.nurseAssociation.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

public interface DivisionRepository extends JpaRepository<Division, Long> {
    Optional<Division> findByDistrictIgnoreCase(String name);

    List<Division> name(String name);

    Object findByDistrict(String district);
}

