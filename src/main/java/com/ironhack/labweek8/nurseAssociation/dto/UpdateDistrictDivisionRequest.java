package com.ironhack.labweek8.nurseAssociation.dto;

public class UpdateDistrictDivisionRequest {

    private Integer divisionId;
    private String divisionName;
    private String district;

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public UpdateDistrictDivisionRequest(){




    }



}
