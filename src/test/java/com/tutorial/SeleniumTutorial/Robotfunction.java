package com.tutorial.SeleniumTutorial;
import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.io.*; 
  
public class Robotfunction 
{ 
    public static void main(String[] args) throws IOException, 
                           AWTException, InterruptedException 
    { 
        String command = "notepad.exe"; 
        Runtime run = Runtime.getRuntime(); 
        run.exec(command); 
        try { 
            Thread.sleep(1000); 
        } 
        catch (InterruptedException e) 
        { 
             
            e.printStackTrace(); 
        } 
  
         
        Robot robot = new Robot(); 
   
        robot.keyPress(KeyEvent.VK_W); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_E); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_L); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_C); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_O); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_M); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_E); 
        Thread.sleep(500); 

    }
}
