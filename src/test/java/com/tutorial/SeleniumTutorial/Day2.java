package com.tutorial.SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2 {
	public static void main(String[] args) throws Throwable {
	       
        System.setProperty("webdriver.chrome.driver","E:\\Maveric Sessioc\\Selenium\\chromedriver.exe");
       
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://www.facebook.com/");
       
        driver.manage().window().maximize();
       
        Thread.sleep(5000);
       
        WebElement firstName = driver.findElement(By.id("u_0_m"));
        firstName.sendKeys("Maveric");
       
        WebElement lastName = driver.findElement(By.id("u_0_o"));
        lastName.sendKeys("Systems");
       
        WebElement mobNum = driver.findElement(By.id("u_0_r"));
        mobNum.sendKeys("1234567899");
       
        WebElement passWord = driver.findElement(By.id("u_0_w"));
        passWord.sendKeys("abc123");
       
        WebElement day = driver.findElement(By.id("day"));
        Select selectDay= new Select(day);
        selectDay.selectByIndex(12);
       
        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth= new Select(month);
        selectMonth.selectByIndex(12);
       
        WebElement year = driver.findElement(By.id("year"));
        Select selectYear= new Select(year);
        selectYear.selectByValue("1988");;
       
        WebElement radio = driver.findElement(By.id("u_0_6"));
        radio.click();
       
        WebElement submitButton = driver.findElement(By.id("u_0_13"));
        submitButton.click();
       
       
       
        Thread.sleep(5000);
       
       
       
        driver.close();
       
       
       
    }
}
