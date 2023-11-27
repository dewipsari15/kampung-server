package com.e_kampoeng.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "warga")
public class WargaModel {

    //    MAKE TABLE SISWA
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column
    private String name;
    @Column
    private String place_of_birth;
    @Column
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private Date date_of_birth;
    @Column
    private String gender;
    @Column
    private String religion;
    @Column
    private Integer nik;
    @Column
    private String no_kk;
    @Column
    private String status_in_family;
    @Column
    private String resident_status;
    @Column
    private String educational;
    @Column
    private String occupation;
    @Column
    private String marital_status;
    @Column
    private String gol_darah;
    @Column
    private String type_of_insurance;
    @Column
    private String type_of_kb;
    @Column
    private String suitability_of_the_place;
    @Column
    private String water_resources;


    //    getter setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
