/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ShowAdminAccount.Main;

import com.com.A7madY911.ShowAdminAccount.GUI.MainView;
import javax.swing.JOptionPane;

/**
 *
 * @author A7madY911
 */
public class ShowAdminAccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if(System.getProperty("os.version").equalsIgnoreCase("6")){
            MainView mView = new MainView();
        } else if(System.getProperty("os.version").equalsIgnoreCase("6.1")){
            MainView mView = new MainView();
        } else{
            JOptionPane.showMessageDialog(null, "Sorry! Your OS is not supported.");
        }
        

    }
    
    
}
