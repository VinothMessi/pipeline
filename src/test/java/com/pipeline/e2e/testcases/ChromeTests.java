package com.pipeline.e2e.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pipeline.e2e.utilities.BrowserFactory;

public class ChromeTests {

	WebDriver myBrowser;
	BrowserFactory browserFactory;

	@BeforeClass
	public void before_Test_Class() {
		browserFactory = new BrowserFactory();
	}

	@BeforeMethod
	public void before_Each_Test_Case() {
		myBrowser = browserFactory.launch("Chrome");
	}

	@Test
	public void verify_Google_Page() throws InterruptedException {
		myBrowser.get("https://www.seleniumhq.org");
	}

	@Test
	public void verify_Selenium_Easy_Page() throws InterruptedException {
		myBrowser.get("https://www.seleniumeasy.com");
	}

	@AfterMethod
	public void after_Each_Test_Case() {
		myBrowser.quit();
	}

}