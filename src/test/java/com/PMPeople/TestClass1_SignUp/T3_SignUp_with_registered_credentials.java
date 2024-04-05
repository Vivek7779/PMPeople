package com.PMPeople.TestClass1_SignUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T3_SignUp_with_registered_credentials extends BaseClass {

	@Test (priority = 3)
	public void signin_with_registered_credentials () throws IOException, InterruptedException {
		
	driverinitialize();
	maximizeWindow();
	driver.get("http://115.244.148.118:8195/signup");
	
	WebElement FirstName=driver.findElement(By.name("Fname"));
	FirstName.sendKeys("Vivek");
	System.out.println("FirstName entered: " + FirstName.getAttribute("value"));
	
	WebElement LastName=driver.findElement(By.name("Lname"));
	LastName.sendKeys("Sale");
	System.out.println("LastName entered: " + LastName.getAttribute("value"));
	
	WebElement Email=driver.findElement(By.name("Email"));
	Email.sendKeys("Viveksale123@gmail.com");
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
	
	WebElement TermsandCondition=driver.findElement(By.name("TermsConditions"));
	TermsandCondition.click();
	
	WebElement SignUp=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/div/li/button"));
	SignUp.click();
	Thread.sleep(1000);
	
	System.out.println("For Alredy registered user , user is alredy registered please , Sign In Message should be show");
	driver.quit();
}
}