package com.example.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {

	public WebDriver driver;
	public String baseUrl;

	public NavigationHelper navigationHelper;
	public FormHelper formHelper;

	public ApplicationManager() {
		driver = new FirefoxDriver();
		baseUrl = "http://webanketa.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

		navigationHelper = new NavigationHelper(this);
		formHelper = new FormHelper(this);
	}

	public void stop() {
		driver.quit();
	}

}
