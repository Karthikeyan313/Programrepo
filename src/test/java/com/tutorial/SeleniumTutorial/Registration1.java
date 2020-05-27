package com.tutorial.SeleniumTutorial;

import java.util.List;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration1 {
public static void main( String[] args){
		try{
			System.setProperty("webdriver.chrome.driver",
					"E:\\Maveric Sessioc\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/newtours/register.php");
		String title= driver.getTitle();
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/input")).sendKeys("Karthikk");
		driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/input")).sendKeys("E");
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/input")).sendKeys("8973456688");
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/input")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//table/tbody/tr[7]/td[2]/input")).sendKeys("Address1");
		driver.findElement(By.xpath("//table/tbody/tr[8]/td[2]/input")).sendKeys("Chennai");
		driver.findElement(By.xpath("//table/tbody/tr[9]/td[2]/input")).sendKeys("Tamilnadu");
		driver.findElement(By.xpath("//table/tbody/tr[10]/td[2]/input")).sendKeys("123456");
		
		Select oSelect = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		List<WebElement> element= oSelect.getOptions();
		System.out.println(element.size());
		System.out.println("The country in the dropdown are\n");
		for(WebElement item :element){
			System.out.println(item.getText());
		}
		
		oSelect.selectByValue("INDIA");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Testuser");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
        String success = driver.getTitle();
        if(success.equalsIgnoreCase("http://demo.guru99.com/test/newtours/register_sucess.php")){
        	System.out.println("Pass user name created ");
        }else{
        	System.out.println("Fail user name not created ");
        }
		
		 driver.quit();
		}catch(Exception e){
			
		}
}
}