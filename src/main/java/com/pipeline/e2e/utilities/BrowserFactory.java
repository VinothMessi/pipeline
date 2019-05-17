package com.pipeline.e2e.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	WebDriver ldriver;
	final String projectPath = "E:\\MyPassion\\myProjects\\E2E\\";
	String driverFilesPath = "src\\main\\resources\\drivers\\";

	public WebDriver launch(String browserName) {
		try {
			switch (browserName) {
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", projectPath + driverFilesPath + "chromedriver.exe");
				ldriver = new ChromeDriver();
				break;
			case "Firefox":
				System.setProperty("webdriver.gecko.driver", projectPath + driverFilesPath + "geckodriver.exe");
				ldriver = new FirefoxDriver();
				break;
			default:
				System.out.println("Browser type not supported");
			}
		} catch (Exception e) {
			System.out.println("Unable to launch a session of : " + browserName + "\n" + e.getMessage());
		}
		ldriver.manage().window().maximize();
		return ldriver;
	}

}