package com.example.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
	}

	public void openMainPage() {
		// Open main page
		driver.manage().deleteAllCookies();
		driver.get(manager.baseUrl + "/en");
	}

	public void submitUserLogin() {
		// Submit user login
		driver.findElement(By.cssSelector("button.small")).click();
	}

	public void loginInSystem(String userLogin, String userPassword) {
		// Login in system
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("user.auth.login")).clear();
		driver.findElement(By.id("user.auth.login")).sendKeys(userLogin);
		driver.findElement(By.id("user.auth.pass")).clear();
		driver.findElement(By.id("user.auth.pass")).sendKeys(userPassword);
	}


	public void viewFormList() {
		// Open list of currently user forms
		driver.findElement(By.linkText("My forms")).click();
	}

	public void logoutFromSystem() {
		// Logout from system
		driver.findElement(By.linkText("Exit")).click();
	}

	public void assertTextPresent(String assertText, String locator) {
		// in this method why asserts text on page
		assertEquals(assertText, driver.findElement(By.cssSelector(locator))
				.getText());

	}

	private void assertEquals(String string, String text) {
		// TODO Auto-generated method stub

	}

	public void openFormForEdit() {
		// Method for edit information of form
		driver.findElement(By.xpath(".//*[@id='formaction']/table/tbody/tr[2]/td[3]/a")).click();

	}

}
