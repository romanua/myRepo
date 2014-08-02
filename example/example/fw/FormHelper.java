package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FormHelper extends HelperBase {

	public FormHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initCreationForm() {
		// Init creation form
		driver.findElement(By.cssSelector("button.medium")).click();
	}

	public void fillFormName(String formName) {
		// Fill user form
		driver.findElement(By.name("form.name")).clear();
		driver.findElement(By.name("form.name")).sendKeys(formName);
	}

	public void createForm() {
		// Create new form
		driver.findElement(By.linkText("Create form")).click();
	}

	public void changeUsersUniquenessByIp() {
		// By Ip of users
		driver.findElement(
				By.xpath("(//input[@name='form.respuniqtype'])[1]")).click();
	}

	public void changeUsersUniquenessBySimple() {
		// No cookies
		driver.findElement(
				By.xpath("(//input[@name='form.respuniqtype'])[2]")).click();

	}

	public void changeUsersUniquenessDoNotVerify() {
		// No followers rules for uniqueness
		driver.findElement(
				By.xpath("(//input[@name='form.respuniqtype'])[3]")).click();

	}

	public void languageForm(String formLanguage) {
		new Select(driver.findElement(By.name("form.lid")))
				.selectByVisibleText(formLanguage);
	}

	public void formTypeTestForm() {
		driver.findElement(By.xpath("(//input[@name='form.formtype'])[2]")).click();		
	}

	public void changeTypeOfElementsShowingOnLeftAndOnRight() {
		// Second "вопросы слева, ответы справа" Type of output elements in profile
		driver.findElement(By.xpath("(//input[@name='form.sideskin'])[2]")).click();		
	}

	public void changeTypeOfElementsShowingOnCenter() {
		// Third "вопросы и ответы по центру" Type of output elements in profile
		driver.findElement(By.xpath("(//input[@name='form.sideskin'])[3]")).click();	
	}

	public void goToEditForm() {
		// edit information in form
		driver.findElement(By.linkText("Editing")).click();
	}

	public void addInformationInForm() {
		// open list of new rules for form
		driver.findElement(By.linkText("Add question / element")).click();
	}

	public void addRuleOneFromMany() {
		driver.findElement(By.linkText("one from many")).click();
	}

	public void saveNewRules() {
		// Submit new settings
		driver.findElement(By.id("submit_constructor_button_prop")).click();
	}

}
