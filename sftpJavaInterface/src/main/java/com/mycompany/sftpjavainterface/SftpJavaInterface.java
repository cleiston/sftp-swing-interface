/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sftpjavainterface;
import com.jcraft.jsch.JSchException;
import javax.swing.JFrame;
import screens.AddFilesFrame;
import screens.LoginFrame;
import screens.UploadFrame;

/**
 *
 * @author almadb
 */
public class SftpJavaInterface {

    public static void main(String[] args) throws JSchException {
        // testing code ///////////////
        /*
        SftpClient sftpClient = new SftpClient("192.168.118.128", 2022, "teste");
        try {
            sftpClient.authPassword("123");
            sftpClient.listFiles("/");
            
        } catch (Exception ex) {
            Logger.getLogger(SftpJavaInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        // testing code ///////////////
        
        
        
        // testing code ///////////////
        
        /*
        SftpClient sftp = new SftpClient("10.52.53.40", 2022, "user1");
        sftp.authPassword("123456");
        AddFilesFrame aff = new AddFilesFrame("4345sjal32lkwfd", sftp);
        aff.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aff.setVisible(true); */
        // testing code ///////////////
        
        
        
        
        // default code ////////////////////////////
        
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginFrame.setVisible(true);
        
        // working code ////////////////////////////
        
        
        
        
    }
    
}
