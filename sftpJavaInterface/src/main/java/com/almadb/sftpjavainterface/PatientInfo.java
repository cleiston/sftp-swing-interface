/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almadb.sftpjavainterface;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author almadb
 */
public class PatientInfo {
    private String fullName;
    private String birth_day;
    private String birth_month;
    private String birth_year;
    private String address_city;
    private String address_state;

    public PatientInfo(String fullName, String birth_day, String birth_month, String birth_year, String address_city, String address_state) {
        this.fullName = fullName;
        this.birth_day = birth_day;
        this.birth_month = birth_month;
        this.birth_year = birth_year;
        this.address_city = address_city;
        this.address_state = address_state;
    }
    
    
    
    public String generateID(){
        String originalString = fullName + birth_day + birth_month + birth_year + address_city + address_state;
        String sha256hex = DigestUtils.sha256Hex(originalString);
        return sha256hex;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }

    public String getBirth_month() {
        return birth_month;
    }

    public void setBirth_month(String birth_month) {
        this.birth_month = birth_month;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getAddress_city() {
        return address_city;
    }

    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }

    public String getAddress_state() {
        return address_state;
    }

    public void setAddress_state(String address_state) {
        this.address_state = address_state;
    }
    
    
}
