package com.PMPeople.TestClass5_DeactivateAccount;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T1_DeactivateAccount extends BaseClass{

	@Test
	public void deactivate() throws IOException, InterruptedException {
		
		driverinitialize();
		driver.get("http://115.244.148.118:8195/signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.name("email"));
		Thread.sleep(2000);
		email.click();
		Thread.sleep(1000);
		email.sendKeys("voronovajuli@konterkulo.com");
		
		WebElement Password=driver.findElement(By.name("password"));
		Thread.sleep(2000);
		Password.click();
		Thread.sleep(1000);
		Password.sendKeys("Ramesh@123");
		
		WebElement Loginbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/li[3]/button"));
		Thread.sleep(2000);
		Loginbtn.click();
		Thread.sleep(1000);
		
		WebElement Profile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		Thread.sleep(1000);
		Profile.click();
		System.out.println("Done");
		
		WebElement EditProfile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/ul/li[6]/a"));
		Thread.sleep(1000);
		EditProfile.click();
		
		WebElement Organizations=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div[2]/div[2]/div/form/div/div[6]/div[1]/button"));
		Thread.sleep(1000);
		Organizations.click();
		
		System.out.println("if user have 2 organizations then not able to Deactivate account.");
		
		WebElement DeactivateAccount=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div/div[3]/button"));
		Thread.sleep(1000);
		DeactivateAccount.click();
		
		System.out.println("User have only one organization.");
		
		WebElement ConfirmDeactivate=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
		Thread.sleep(1000);
		ConfirmDeactivate.click();
		
		System.out.println("User have only 1 Organization thats why account is deactivated.");
	}
}
