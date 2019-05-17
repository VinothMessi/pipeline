package com.pipeline.e2e.testbase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.pipeline.e2e.utilities.BrowserFactory;

public class BaseTest {

	protected WebDriver myBrowser;
	protected BrowserFactory browserFactory;

	@BeforeClass
	public void before_Test_Class() {
		browserFactory = new BrowserFactory();
	}

	@AfterMethod
	public void after_Each_Test_Case() {
		myBrowser.quit();
	}

}