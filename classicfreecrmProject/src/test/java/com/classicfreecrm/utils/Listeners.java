package com.classicfreecrm.utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("yah! test is pass, we will take snapshot");
		System.out.println(result.getMethod().getMethodName());
//		try {
//			TakeScreenshot.screenshot(result.getMethod().getMethodName());
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("oops test is fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
