package com.qa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_form_locators {
	
	WebDriver d;
	
	public Login_form_locators(WebDriver d)
	{
		this.d=d;
	}
	
	@FindBy(how=How.ID,using="userId")
	@CacheLookup
	WebElement username;
	
	
	

}
