package com.classicfreecrm.test;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

public class createNewcontactTest extends BaseTest {
  public createNewcontactTest() throws IOException {
	  		super();
			
	}

@Test

  public void newContact() {
	homePageclassicfreecrm=loginPageClassicfreecrm.loginSuccess("momobiz","Mohamed123");
	// je peux faire  un softAssert puis continuer les actions suivantes 
	
	createNewcontactPage=homePageclassicfreecrm.createNewcontact();
	newcontactInformations=createNewcontactPage.newContact("Mr.","hamoudi","Ahmedouch");
	Assert.assertTrue(newcontactInformations.documentsIsDisplayed());
  }
}
