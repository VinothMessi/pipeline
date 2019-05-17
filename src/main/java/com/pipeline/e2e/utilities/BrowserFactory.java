package com.pipeline.e2e.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	WebDriver ldriver;

	public WebDriver launch(String browserName) {
		try {
			switch (browserName) {
			case "Chrome":
				System.setProperty("webdriver.chrome.driver",
						"E:\\MyPassion\\myProjects\\E2E\\src\\main\\resources\\drivers\\chromedriver.exe");
				ldriver = new ChromeDriver();
				break;
			case "Firefox":
				System.setProperty("webdriver.gecko.driver",
						"E:\\MyPassion\\myProjects\\E2E\\src\\main\\resources\\drivers\\geckodriver.exe");
				ldriver = new FirefoxDriver();
				break;
			default:
				System.out.println(browserName + ": " + "Browser type not supported");
			}
		} catch (Exception e) {
			System.out.println("Unable to launch a session of : " + browserName + "\n" + e.getMessage());
		}
		ldriver.manage().window().maximize();
		return ldriver;
	}

}