package com.classicfreecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewContactPage extends BasePage {
	
	By select=By.xpath("//select[@class='select' and @name='title']");
	By firstnameInput=By.id("first_name");
	By lastnameInput= By.id("surname");
	By saveButton=By.xpath("//input[@class='button' and @type='submit' and @value='Save']");
	
	

	public CreateNewContactPage(WebDriver driver) {
		super(driver);
		
	}
	
	public NewContactInformations newContact(String gender, String firstname, String lastname) {
		  selectOption(select, gender);
		  fillField(firstnameInput, firstname);
		  fillField(lastnameInput,lastname);
		  clickOn(saveButton);
		  return new NewContactInformations(driver);
	  }

}
