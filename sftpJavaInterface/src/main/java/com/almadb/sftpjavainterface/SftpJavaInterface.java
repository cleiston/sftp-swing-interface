/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.almadb.sftpjavainterface;
import com.jcraft.jsch.JSchException;
import javax.swing.JFrame;
import com.almadb.screens.LoginFrame;

/**
 *
 * @author almadb
 */
public class SftpJavaInterface {

    public static void main(String[] args) throws JSchException {
        
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginFrame.setVisible(true);    
        
    }
    
}
