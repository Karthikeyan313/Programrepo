package com.tutorial.SeleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCallPOM {
    
    public static WebDriver driver;
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver","C:\\E:\\Maveric Sessioc\\Selenium\\chromedriver.exe");
        
       driver = new ChromeDriver(); 
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        FacebookPOM p=new FacebookPOM();
        
        p.getFirstName().sendKeys("Maveric");
        
        p.getLastName().sendKeys("Systems");        
               
    }

}
