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
	driver.get("http://115.244.148.118:8195/signup");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement FirstName=driver.findElement(By.name("Fname"));
	Thread.sleep(2000);
	FirstName.click();
	FirstName.sendKeys("Vivek");
	
	WebElement LastName=driver.findElement(By.name("Lname"));
	Thread.sleep(2000);
	LastName.click();
	LastName.sendKeys("Sale");
	
	WebElement Email=driver.findElement(By.name("Email"));
	Thread.sleep(2000);
	Email.click();
	Email.sendKeys("Viveksale123@gmail.com");
	
	WebElement Password=driver.findElement(By.name("Password"));
	Thread.sleep(2000);
	Password.click();		
	Password.sendKeys("Vivek@123");
	
	
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