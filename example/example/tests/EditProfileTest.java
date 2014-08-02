package com.example.tests;

import org.testng.annotations.Test;

public class EditProfileTest extends TestBase {

	@Test
	public void ViewProfileListTest() {
		app.navigationHelper.openMainPage();
		app.navigationHelper.loginInSystem("firstTest", "qwerty");
		app.navigationHelper.submitUserLogin();
		app.navigationHelper.viewFormList();
		app.navigationHelper.openFormForEdit();
		app.formHelper.goToEditForm();
		app.formHelper.addInformationInForm();
		app.formHelper.addRuleOneFromMany();
		app.formHelper.saveNewRules();
	}
}