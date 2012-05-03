/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ShowAdminAccount.Cmds;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author A7madY911
 */

public class batchCmd {
    File tmpf = new File("batch.bat");
    File cmdFilePath = new File("C:\\Windows\\System32\\cmd.exe");
    
    //Show Commands for Windows 7
    public void ShowBatchCmdWin7() throws IOException{
        
        if(cmdFilePath.exists()){
                
            delThenCreateFile();
                
            if(tmpf.exists()){
                BufferedWriter bw = new BufferedWriter(new FileWriter(tmpf));
                bw.write("@echo off");
                bw.newLine();
                bw.write("net user administrator /active:yes");
                bw.newLine();
                bw.write("exit");
                bw.close();
                    
                execFile();
                
            }
            } else {
                JOptionPane.showMessageDialog(null,"Error! Can't find cmd.");
            }
    
    }
    
    //Hide Commands for Windows 7
    public void HideBatchCmdWin7() throws IOException{

            if(cmdFilePath.exists()){
                
                delThenCreateFile();
                
                if(tmpf.exists()){
                    BufferedWriter bw = new BufferedWriter(new FileWriter(tmpf));
                    bw.write("@echo off");
                    bw.newLine();
                    bw.write("net user administrator /active:no");
                    bw.newLine();
                    bw.write("exit");
                    bw.close();
                    
                    execFile();
            }
            } else {
                JOptionPane.showMessageDialog(null,"Error! Can't find cmd.");
            }
    
    }
    
    //Delete the temp file when exit
    public void fileExitDel(){
        
        try {
            //File tempFile = new File(fileName);
            if (tmpf.exists()) {
                tmpf.deleteOnExit();
            } 
        } catch (Exception ex) {
            
            
        }
        
    }
    
    //show message when cleaned
    public void cleanDone(){
        JOptionPane.showMessageDialog(null,"Done!");
    }
    
	//Delete if file exists and create it again
    public void delThenCreateFile() throws IOException{
        if(tmpf.exists()){
            tmpf.delete();
        }
        tmpf.createNewFile();
    }
    
	//execute the file
    public void execFile() throws IOException{
        try {

            if (tmpf.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Process p = Runtime.getRuntime().exec("cmd /c start /min " + tmpf);
                    if(tmpf.exists()){
                      fileExitDel();
                    }
                    JOptionPane.showMessageDialog(null,"Done!");
                    
                } else {
                    JOptionPane.showMessageDialog(null,"File is not supported! contact the Developer");
                }
            } else {
                JOptionPane.showMessageDialog(null,"Error! try again later.");
            }
           
        } catch (Exception ex) {
            
            
        }
    }
    
}
