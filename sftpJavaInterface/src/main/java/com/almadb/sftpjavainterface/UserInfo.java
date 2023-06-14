/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.almadb.sftpjavainterface;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author almadb
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
