

package com.PMPeople.TestClass1_SignUp;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;


public class T2_Checking_with_negative_details extends BaseClass {
	
	@Test(priority = 2)
	public void negativeDetails () throws IOException, InterruptedException {
	
    driverinitialize();
	maximizeWindow();
	driver.get("http://115.244.148.118:8195/signup");
	
	WebElement FirstName=driver.findElement(By.name("Fname"));
	FirstName.sendKeys("!@#$%$%");
	System.out.println("First Name entered: " + FirstName.getAttribute("value"));
	
	WebElement LastName=driver.findElement(By.name("Lname"));
	LastName.sendKeys("$^^&&()");
	System.out.println("Last Name entered: " + LastName.getAttribute("value"));
	
	WebElement Email=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/div/div[3]/input"));
	Email.sendKeys("!@#$%^&**(((");
	System.out.println("Email entered: " + Email.getAttribute("value"));
	
	WebElement Password=driver.findElement(By.name("Password"));		
	Password.sendKeys("Vivek@123");
	System.out.println("Password entered: " + Password.getAttribute("value"));
	
	WebElement Country=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/div/div[5]/select"));
	clickWithPause(Country);
	
	//Create a Select object for the dropdown
	Select dropdown=new Select(Country);
	
	//Select the country by its visible text
	dropdown.selectByVisibleText("India");

	// Get the selected option's text value
	WebElement selectedOption = dropdown.getFirstSelectedOption();
	String selectedCountry = selectedOption.getText();
	
	WebElement TermsandCondition=driver.findElement(By.name("TermsConditions"));
	TermsandCondition.click();
	
	WebElement SignUp=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/div/li/button"));
	SignUp.click();
	Thread.sleep(1000);
	
	System.out.println("First Name , Last Name And Email should not Accept Special Characters only.");
	driver.quit();
	
	
	}
}
