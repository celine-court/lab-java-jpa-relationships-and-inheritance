package com.ironhack.labweek8.nurseAssociation.service;

import com.ironhack.labweek8.nurseAssociation.repository.DivisionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ironhack.labweek8.nurseAssociation.repository.AssociationRepository;



@SpringBootApplication
public class AssociationService {

    private final AssociationRepository associationRepository;


      public AssociationService(AssociationRepository associationRepository) {
        this.associationRepository = associationRepository;
    }
}
