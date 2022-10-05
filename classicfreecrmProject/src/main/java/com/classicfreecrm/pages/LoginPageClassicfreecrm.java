package com.classicfreecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageClassicfreecrm extends BasePage {
	
	By usernameInput=By.cssSelector("input[name='username']");
	By passwordInput=By.cssSelector("input[name='password']");
	By loginSubmitBotton=By.xpath("//input[@type='submit']");

	public LoginPageClassicfreecrm(WebDriver driver, String url) {
		super(driver);
		openUrl(url);
		
	}
	
	public void loginWith(String username, String password) {
		fillField(usernameInput, username);
		fillField(passwordInput, password);
		clickOn(loginSubmitBotton);
		
	}
	
	public HomePageclassicfreecrm loginSuccess(String username, String password) {
		loginWith(username, password);
		return new HomePageclassicfreecrm(driver);
	}
	

}
