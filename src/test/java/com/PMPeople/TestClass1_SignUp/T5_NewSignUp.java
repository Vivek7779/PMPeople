package com.PMPeople.TestClass1_SignUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T5_NewSignUp extends BaseClass{

	@Test
	public void Signup() throws InterruptedException, IOException {
		
		driverinitialize();
		maximizeWindow();
		driver.get("http://115.244.148.118:8195/signup");
		
		WebElement FirstName=driver.findElement(By.name("Fname"));
		FirstName.sendKeys("Ramesh");
		
		WebElement LastName=driver.findElement(By.name("Lname"));
		LastName.sendKeys("Kankadiya");
		
		WebElement Email=driver.findElement(By.name("Email"));
		Email.sendKeys("voronovajuli@konterkulo.com");
		
		WebElement Password=driver.findElement(By.name("Password"));	
		Password.sendKeys("Ramesh@123");
		
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
