package com.example.tests;

import org.testng.annotations.Test;

public class ProfileViewList extends TestBase {

	@Test
	public void ViewProfileListTest()  {
		app.navigationHelper.openMainPage();
		app.navigationHelper.loginInSystem("firstTest", "qwerty");
		app.navigationHelper.submitUserLogin();
		app.navigationHelper.viewFormList();
		app.navigationHelper.logoutFromSystem();
		app.navigationHelper.assertTextPresent("Вы вышли из системы!", "div.logout");
	}
}
