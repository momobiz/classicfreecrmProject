package com.classicfreecrm.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class HomePageclassicfreecrm extends BasePage{
	
	By logo=By.xpath("//td[contains(text(),'CRMPRO')]");
	By contacts=By.xpath("//a[contains(text(),'Contacts')]");
	By newcontact=By.xpath("//a[@title='New Contact']");

	public HomePageclassicfreecrm(WebDriver driver) {
		super(driver);
		switchFrame("mainpanel");
		System.out.println("changement de frame");
	}
	
	public boolean logoDisplayed() {
		
		return isDisplayed(logo);
		
	}
	
	public CreateNewContactPage createNewcontact() {
		moveMouseTo(contacts);
		clickOn(newcontact);
		return new CreateNewContactPage(driver);
	}


}
