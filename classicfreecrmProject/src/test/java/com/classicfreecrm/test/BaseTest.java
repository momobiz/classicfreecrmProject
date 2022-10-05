package com.classicfreecrm.test;

import org.testng.annotations.Test;

import com.classicfreecrm.pages.CreateNewContactPage;
import com.classicfreecrm.pages.HomePageclassicfreecrm;
import com.classicfreecrm.pages.LoginPageClassicfreecrm;
import com.classicfreecrm.pages.NewContactInformations;
import com.classicfreecrm.utils.ReadDatasheet;
import com.classicfreecrm.utils.WebListener;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;

public abstract class BaseTest {
	
	public static WebDriver driver;
	public LoginPageClassicfreecrm loginPageClassicfreecrm;
	public HomePageclassicfreecrm homePageclassicfreecrm;
	public CreateNewContactPage createNewcontactPage;
	public NewContactInformations newcontactInformations;
	
	
	public Properties prop;
	public  EventFiringWebDriver e_driver;
	public  WebListener webListener;
	public ATUTestRecorder record;
	public CreateNewContactPage createNewContactPage;

public BaseTest() throws IOException {
	prop=new Properties();
	FileInputStream fis=new FileInputStream(".\\src\\test\\java\\com\\classicfreecrm\\config\\config.properties");
	prop.load(fis);
	
}
public void initialisation() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  e_driver=new EventFiringWebDriver(driver);
	  webListener=new WebListener();
	  e_driver.register(webListener);
	  driver=e_driver;
	  
	
	  loginPageClassicfreecrm=new LoginPageClassicfreecrm(driver,prop.getProperty("url"));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  
} 

 @BeforeMethod
  public void beforeMethod(Method method) throws ATUTestRecorderException {
	  initialisation();
//	  record=new ATUTestRecorder(".\\videos",method.getName(), false);
//	  record.start();
	  
	  
	  
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() throws ATUTestRecorderException {
//	  record.stop();
  }
  

  @DataProvider

  public String[][] readData() throws InvalidFormatException, IOException{
	  
	 return  ReadDatasheet.data();
	  
	  
	  
  }

}
