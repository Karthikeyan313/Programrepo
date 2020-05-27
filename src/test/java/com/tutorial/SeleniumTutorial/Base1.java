package com.tutorial.SeleniumTutorial;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
public static void main( String[] args){
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Maveric Sessioc\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://wordpress.com/create-blog/");
		String title= driver.getTitle();
		 
		 List <WebElement> links =driver.findElements(By.tagName("a"));
			
		  
		 System.out.println(links.size());
		 
		 
		 Iterator<WebElement> it=links.iterator();		 
		 while(it.hasNext()){
			  String url = it.next().getAttribute("href");
			  
			System.out.println("The link name is "+url);
	
			
		 }
	
		  

		 driver.quit();
}
}
