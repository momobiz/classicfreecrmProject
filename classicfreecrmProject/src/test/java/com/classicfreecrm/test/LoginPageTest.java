package com.classicfreecrm.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.classicfreecrm.pages.LoginPageClassicfreecrm;
import com.classicfreecrm.utils.TakeScreenshot;

public class LoginPageTest extends BaseTest{
	

	
  public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

@Test
  public void loginSuccess(Method method) throws IOException {
	  homePageclassicfreecrm=loginPageClassicfreecrm.loginSuccess(prop.getProperty("username"), prop.getProperty("password"));
	  Assert.assertTrue(homePageclassicfreecrm.logoDisplayed());
	  
//	  TakeScreenshot.screenshot(method.getName());
	  
  }
  
  @Test(enabled=false, dataProvider="readData")
  public void login(String username, String password) {
	  loginPageClassicfreecrm.loginWith(username, password);
  }
  

 
  
}
