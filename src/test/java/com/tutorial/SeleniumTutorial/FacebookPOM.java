package com.tutorial.SeleniumTutorial;

import java.sql.Driver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPOM extends ToCallPom {
    
    @FindBy (id="u_0_m")
    private WebElement firstName;

    
    @FindBy (id="u_0_o")
    private WebElement lastName;
    
    
    public WebElement getFirstName() {
        return firstName;
    }


    public WebElement getLastName() {
        return lastName;
    }

    public FacebookPOM() {
                
        PageFactory.initElements(driver, this);
        
    }
    

}