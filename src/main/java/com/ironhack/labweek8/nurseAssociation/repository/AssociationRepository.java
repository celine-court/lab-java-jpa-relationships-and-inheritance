package com.ironhack.labweek8.nurseAssociation.repository;

import com.ironhack.labweek8.nurseAssociation.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface AssociationRepository extends JpaRepository<Association, Long> {
}
