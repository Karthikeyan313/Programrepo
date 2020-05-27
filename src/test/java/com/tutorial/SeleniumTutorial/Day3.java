package com.tutorial.SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Day3 {
	public static void main(String[] args) throws Throwable {
	       
	       
        System.setProperty("webdriver.chrome.driver","E:\\Maveric Sessioc\\Selenium\\chromedriver.exe");
       
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://demoqa.com/automation-practice-table/");
       
        driver.manage().window().maximize();
       
       java.util.List<org.openqa.selenium.WebElement> findElements = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr//td[1]"));
       
       Object colOne;
	for (WebElement tdata : colOne) {
       
           System.out.println(tdata.getText());
          
    }
       
        Thread.sleep(5000);
       
        driver.quit();
}
