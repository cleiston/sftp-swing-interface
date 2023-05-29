/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sftpjavainterface;
import javax.swing.JFrame;
import screens.LoginFrame;

/**
 *
 * @author almadb
 */
public class SftpJavaInterface {

    public static void main(String[] args) {
        /*
        SftpClient sftpClient = new SftpClient("192.168.118.128", 2022, "teste");
        try {
            sftpClient.authPassword("123");
            sftpClient.listFiles("/");
            
        } catch (Exception ex) {
            Logger.getLogger(SftpJavaInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginFrame.setVisible(true);
        
        
    }
    
}
