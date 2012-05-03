package com.ShowAdminAccount.Main;

import com.com.A7madY911.ShowAdminAccount.GUI.MainView;
import javax.swing.JOptionPane;

/**
 *
 * @author A7madY911
 */
public class ShowAdminAccountMain {

    public static void main(String[] args) {

        if (System.getProperty("os.version").equalsIgnoreCase("6")) {
            MainView mView = new MainView();
        } else if (System.getProperty("os.version").equalsIgnoreCase("6.1")) {
            MainView mView = new MainView();
        } else {
            JOptionPane.showMessageDialog(null, "Sorry! Your OS is not supported.");
        }

    }
}
