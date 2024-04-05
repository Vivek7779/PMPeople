package com.PMPeople.TestClass1_SignUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T4_ChangingName_Country_FromSignUp extends BaseClass{

	@Test (priority = 4)
	public void T4ChangingName_FromSignUp () throws IOException, InterruptedException {
		
		driverinitialize();
		maximizeWindow();
		driver.get("http://115.244.148.118:8195/signup");
		
		WebElement FirstName=driver.findElement(By.name("Fname"));
		FirstName.sendKeys("Sunita");
		
		WebElement LastName=driver.findElement(By.name("Lname"));
		LastName.sendKeys("Patel");
		
		WebElement Email=driver.findElement(By.name("Email"));
		Email.sendKeys("vivek.sale@plusinfosys.com");
		
		WebElement Password=driver.findElement(By.name("Password"));	
		Password.sendKeys("Vivek@123");
		
		WebElement Country=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/div/div[5]/select"));
		clickWithPause(Country);
		
		//Create a Select object for the dropdown
		Select dropdown=new Select(Country);
		
		//Select the country by its visible text
		dropdown.selectByVisibleText("Norway");
		
		WebElement TermsandCondition=driver.findElement(By.name("TermsConditions"));
		TermsandCondition.click();
		
		WebElement SignUp=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/div/li/button"));
		SignUp.click();
		Thread.sleep(1000);
		
		System.out.println("First Name and Last Name cannot be change directly from Sign up Page");
		driver.quit();
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}