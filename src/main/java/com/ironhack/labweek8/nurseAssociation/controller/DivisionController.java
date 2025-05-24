package com.ironhack.labweek8.nurseAssociation.controller;

import com.ironhack.labweek8.nurseAssociation.dto.UpdateDistrictDivisionRequest;
import com.ironhack.labweek8.nurseAssociation.model.Division;
import com.ironhack.labweek8.nurseAssociation.service.DivisionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/divisions")
public class DivisionController {
    private final DivisionService divisionService;

    public DivisionController(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Division createDivision(@RequestBody Division division){
        return divisionService.create(division);

    }

    @GetMapping
    public List<Division> findAllDivisions() {
        return divisionService.findAll();
    }

    @GetMapping("/{id}")
    public Division findDivisionById(@PathVariable Long id) {
        return divisionService.findById(id);
    }

    @GetMapping("/{district}")
    public Division findDivisionByDistrict(@PathVariable String district) {
        return divisionService.findByDistrict(district);
    }

    @PutMapping("/{id}")
    public Division updateDivision(@PathVariable Long id, @RequestBody Division division) {
        return divisionService.update(id, division);
    }

    @PutMapping("/{district}")
    public Division updateDivision(@PathVariable String district, @RequestBody Division division) {
        return divisionService.update(district, division);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCar(@PathVariable Long id) {
        divisionService.delete(id);
    }

}
