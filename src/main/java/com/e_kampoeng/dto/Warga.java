package com.e_kampoeng.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import java.util.Date;

public class Warga {

    private String name;
    private String place_of_birth;
    private Date date_of_birth;
    private String gender;
    private String religion;
    private Integer nik;
    private String no_kk;
    private String status_in_family;
    private String resident_status;
    private String educational;
    private String occupation;
    private String marital_status;
    private String gol_darah;
    private String type_of_insurance;
    private String type_of_kb;
    private String suitability_of_the_place;
    private String water_resources;

    //    GETTER SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Integer getNik() {
        return nik;
    }

    public void setNik(Integer nik) {
        this.nik = nik;
    }

    public String getNo_kk() {
        return no_kk;
    }

    public void setNo_kk(String no_kk) {
        this.no_kk = no_kk;
    }

    public String getStatus_in_family() {
        return status_in_family;
    }

    public void setStatus_in_family(String status_in_family) {
        this.status_in_family = status_in_family;
    }

    public String getResident_status() {
        return resident_status;
    }

    public void setResident_status(String resident_status) {
        this.resident_status = resident_status;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getGol_darah() {
        return gol_darah;
    }

    public void setGol_darah(String gol_darah) {
        this.gol_darah = gol_darah;
    }

    public String getType_of_insurance() {
        return type_of_insurance;
    }

    public void setType_of_insurance(String type_of_insurance) {
        this.type_of_insurance = type_of_insurance;
    }

    public String getType_of_kb() {
        return type_of_kb;
    }

    public void setType_of_kb(String type_of_kb) {
        this.type_of_kb = type_of_kb;
    }

    public String getSuitability_of_the_place() {
        return suitability_of_the_place;
    }

    public void setSuitability_of_the_place(String suitability_of_the_place) {
        this.suitability_of_the_place = suitability_of_the_place;
    }

    public String getWater_resources() {
        return water_resources;
    }

    public void setWater_resources(String water_resources) {
        this.water_resources = water_resources;
    }
}
