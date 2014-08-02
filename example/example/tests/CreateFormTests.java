package com.example.tests;

import org.testng.annotations.Test;

public class CreateFormTests extends TestBase {

	@Test
	public void CreateDefaultProfileTest() throws Exception {
		app.navigationHelper.openMainPage();
		app.navigationHelper.loginInSystem("firstTest", "qwerty");
		app.navigationHelper.submitUserLogin();
		app.formHelper.createForm();
		app.formHelper.languageForm("English");
		app.formHelper.fillFormName("form name");
		app.formHelper.initCreationForm();
		app.navigationHelper.logoutFromSystem();
	}

	@Test
	public void CreateEmptyProfileTest() throws Exception {
		app.navigationHelper.openMainPage();
		app.navigationHelper.loginInSystem("firstTest", "qwerty");
		app.navigationHelper.submitUserLogin();
		app.formHelper.createForm();
		app.formHelper.languageForm("English");
		app.formHelper.fillFormName("");
		app.formHelper.initCreationForm();
		app.navigationHelper.logoutFromSystem();
	}

	@Test
	public void CreateFormTypeTestForm() throws Exception {
		app.navigationHelper.openMainPage();
		app.navigationHelper.loginInSystem("firstTest", "qwerty");
		app.navigationHelper.submitUserLogin();
		app.formHelper.createForm();
		app.formHelper.languageForm("English");
		app.formHelper.fillFormName("form name");
		app.formHelper.formTypeTestForm();
		app.formHelper.initCreationForm();
		app.navigationHelper.logoutFromSystem();
	}

	@Test
	public void CreateFormElementsShowingOnLeftAndOnRightTest()
			throws Exception {
		app.navigationHelper.openMainPage();
		app.navigationHelper.loginInSystem("firstTest", "qwerty");
		app.navigationHelper.submitUserLogin();
		app.formHelper.createForm();
		app.formHelper.languageForm("English");
		app.formHelper.fillFormName("form name");
		app.formHelper.changeTypeOfElementsShowingOnLeftAndOnRight();
		app.formHelper.initCreationForm();
		app.navigationHelper.logoutFromSystem();
	}

	@Test
	public void CreateFormElementsShowingOnCenterTest() throws Exception {
		app.navigationHelper.openMainPage();
		app.navigationHelper.loginInSystem("firstTest", "qwerty");
		app.navigationHelper.submitUserLogin();
		app.formHelper.createForm();
		app.formHelper.languageForm("English");
		app.formHelper.fillFormName("form name");
		app.formHelper.changeTypeOfElementsShowingOnCenter();
		app.formHelper.initCreationForm();
		app.navigationHelper.logoutFromSystem();
	}
	
	@Test
	public void CreateNormalFormUniquenessSimpleTest() throws Exception {
		app.navigationHelper.openMainPage();
		app.navigationHelper.loginInSystem("firstTest", "qwerty");
		app.navigationHelper.submitUserLogin();
		app.formHelper.createForm();
		app.formHelper.languageForm("English");
		app.formHelper.fillFormName("form name");
		app.formHelper.changeTypeOfElementsShowingOnCenter();
		app.formHelper.changeUsersUniquenessBySimple();
		app.formHelper.initCreationForm();
		app.navigationHelper.logoutFromSystem();
	}
	
	@Test
	public void CreateNormalFormUniquenessDoNotVerifyTest() throws Exception {
		app.navigationHelper.openMainPage();
		app.navigationHelper.loginInSystem("firstTest", "qwerty");
		app.navigationHelper.submitUserLogin();
		app.formHelper.createForm();
		app.formHelper.languageForm("English");
		app.formHelper.fillFormName("form name");
		app.formHelper.changeTypeOfElementsShowingOnCenter();
		app.formHelper.changeUsersUniquenessDoNotVerify();
		app.formHelper.initCreationForm();
		app.navigationHelper.logoutFromSystem();
	}
		

}
