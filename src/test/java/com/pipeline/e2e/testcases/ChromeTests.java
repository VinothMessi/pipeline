package com.pipeline.e2e.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pipeline.e2e.testbase.BaseTest;

public class ChromeTests extends BaseTest {
	
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

}