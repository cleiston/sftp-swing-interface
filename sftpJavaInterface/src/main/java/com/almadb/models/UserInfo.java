/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almadb.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author almadb
 * Represents user of the system. At some point it will be used to trace operations performed by the user
 */
public class UserInfo {
    private String username;
    private String os;
    private String dateTime;
    
    public UserInfo(String username){
        this.username = username;
        os = System.getProperty("os.name");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        dateTime = dateFormat.format(cal.getTime());
    }

    public String getUsername() {
        return username;
    }

    public String getOs() {
        return os;
    }

    public String getDateTime() {
        return dateTime;
    }
    
    @Override
    public String toString(){
        return username + ":" + os + ":" + dateTime;
    }
}
