package com.PMPeople.TestClass1_SignUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import Resources.BaseClass;

public class T1_SignUp extends BaseClass {
	@Test(priority = 1)
	public void Signup() throws InterruptedException, IOException {
	
		driverinitialize();
		maximizeWindow();
		driver.get("http://115.244.148.118:8195/signup");
		
		Thread.sleep(2000);
		
		WebElement FirstName=driver.findElement(By.name("Fname"));
		clickWithPause(FirstName);
		FirstName.sendKeys("Vivek");
		System.out.println("Email entered: " + FirstName.getAttribute("value"));
		
		WebElement LastName=driver.findElement(By.name("Lname"));
		clickWithPause(LastName);
		LastName.sendKeys("Sale");
		
		WebElement Email=driver.findElement(By.name("Email"));
		clickWithPause(Email);
		Email.sendKeys("Viveksale123@gmail.com");
		
		WebElement Password=driver.findElement(By.name("Password"));
		clickWithPause(Password);		
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
		
		System.out.println("Sign up successful");
		driver.quit();
	}

	
}


