package com.PMPeople.TestClass1_SignUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T1_SignUp extends BaseClass {
	@Test
	public void Signup() throws InterruptedException, IOException {

		driverinitialize();
		maximizeWindow();
		driver.get("http://115.244.148.118:8195/signup");

		Thread.sleep(2000);

		WebElement FirstName = driver.findElement(By.name("Fname"));
		clickWithPause(FirstName);
		FirstName.sendKeys("Vivek");
		System.out.println("Email entered: " + FirstName.getAttribute("value"));

		WebElement LastName = driver.findElement(By.name("Lname"));
		clickWithPause(LastName);
		LastName.sendKeys("Sale");
		System.out.println("Last Name entered: " + LastName.getAttribute("value"));

		WebElement Email = driver.findElement(By.name("Email"));
		clickWithPause(Email);
		Email.sendKeys("Viveksale123@gmail.com");
		System.out.println("Email entered: " + Email.getAttribute("value"));

		WebElement Password = driver.findElement(By.name("Password"));
		clickWithPause(Password);
		Password.sendKeys("Vivek@123");
		System.out.println("Password entered: " + Password.getAttribute("value"));

		WebElement Country = driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/div/div[5]/select"));
		clickWithPause(Country);

		// Create a Select object for the dropdown
		Select dropdown = new Select(Country);

		// Select the country by its visible text
		dropdown.selectByVisibleText("India");

		// Get the selected option's text value
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		String selectedCountry = selectedOption.getText();
		System.out.println("Country : " + selectedCountry);

		WebElement TermsandCondition = driver.findElement(By.name("TermsConditions"));
		TermsandCondition.click();

		WebElement SignUp = driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/div/li/button"));
		SignUp.click();
		Thread.sleep(1000);

		System.out.println("Sign up successful");
		driver.quit();
	}

}
