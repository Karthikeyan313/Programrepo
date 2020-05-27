package com.tutorial.SeleniumTutorial;
import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Robot_Class {
 
public static void main(String[] args) throws AWTException {
 
	System.setProperty("webdriver.chrome.driver",
			"E:\\Maveric Sessioc\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
 
driver.get("https://www.facebook.com");
 
// Create object of Robot class
Robot robot = new Robot();
 
robot.mouseWheel(10);
 
}
 
}