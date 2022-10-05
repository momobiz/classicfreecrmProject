package com.classicfreecrm.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.asynchttpclient.util.HttpConstants.Methods;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.classicfreecrm.test.BaseTest;

public class TakeScreenshot extends BaseTest {
	
	public TakeScreenshot() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void screenshot(String str) throws IOException {
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(".\\snapshots\\"+str+".png"));
	}

}
