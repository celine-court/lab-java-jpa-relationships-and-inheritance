package com.ironhack.labweek8.nurseAssociation.service;

import com.ironhack.labweek8.nurseAssociation.exception.exception;
import com.ironhack.labweek8.nurseAssociation.model.Division;
import com.ironhack.labweek8.nurseAssociation.repository.DivisionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService {

    private final DivisionRepository divisionRepository;

    public DivisionService(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    public Division create(Division division) {
        return divisionRepository.save(division);
    }

    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    public Division findById(Long id) {
        return divisionRepository.findById(id)
                .orElseThrow(() -> new exception("Division not found with id: " + id));
    }
    public Division findByDistrict(String district) {
        return divisionRepository.findByDistrictIgnoreCase(district)
                .orElseThrow(() -> new exception("Division not found with district: " + district));
    }


    public Division update(String district, Division division) {
//        find the division by district name
        var existingDivision = divisionRepository.findByDistrict(district);
//        if we find district, we update the division and return it
        if (existingDivision.isPresent()){
            Division divisionToUpdate = existingDivision.get();
            divisionToUpdate.setName(division.getName());
            divisionToUpdate.setDistrict(division.getDistrict());
            divisionToUpdate.setPresident(division.getPresident());
            return divisionRepository.save(divisionToUpdate);
//        else we throw and exception
        } else {
            throw new exception("Division not found with name: " + district);
        }
    }



    public void delete(Long id) {
        divisionRepository.deleteById(id);
    }

}
