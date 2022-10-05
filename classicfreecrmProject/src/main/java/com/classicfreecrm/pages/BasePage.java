package com.classicfreecrm.pages;





import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Frame;


public abstract class BasePage {
	
	public WebDriver driver;
	public int timeouts=5;
	public WebDriverWait wait;
	public static final Logger logger=Logger.getLogger(BasePage.class.getName());
	public JavascriptExecutor js;
	public Actions action;
	
	
	
	
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, timeouts);
		
	}
	


	public void setTimeouts(int timeouts) {
		this.timeouts = timeouts;
	}



	public void openUrl(String url) {
		driver.get(url);
	}
	
	public WebElement find(By locator) {
		
		return driver.findElement(locator);
	}
	
	public void fillField(By element, String str) {
		find(element).sendKeys(str);
	}
	public void clickOn(By element) {
		find(element).click();
	}
	public void clearField(By element) {
		find(element).clear();
	}
	
	public boolean isDisplayed(By element) {
		try {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
			
		} catch (Exception e) {
			
			logger.log(Level.WARNING, "Element introuvable pour cause "+e.getMessage());
			return false;
		}
		
		return true;
	}
	
	public void scrolldownTo(int pixelNb) {
		js=(JavascriptExecutor) driver;
		js.executeScript("scroll(0,"+pixelNb+")");
		
		
	}
	
	public void switchFrame(String frameName) {
		driver.switchTo().frame(frameName);
		
	}
	
	public void moveMouseTo(By element) {
		action=new Actions(driver);
		action.moveToElement(find(element)).build().perform();
	}
	
	public void selectOption(By selectLocator , String optionName) {
		
		Select select=new Select(find(selectLocator));
		select.selectByValue(optionName);
		
	}
	
	

}
