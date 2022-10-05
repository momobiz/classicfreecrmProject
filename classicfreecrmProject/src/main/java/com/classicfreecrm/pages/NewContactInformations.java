package com.classicfreecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactInformations extends BasePage{
	
	By documents=By.id("tab_vdocs");
	
	

	public NewContactInformations(WebDriver driver) {
		super(driver);
		
	}
	
	public boolean documentsIsDisplayed() {
		return isDisplayed(documents);
	}
	

  
  
  

}
