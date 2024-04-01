package com.PMPeople.TestClass4_EditProfile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import Resources.BaseClass;

public class T1_ChangePassword extends BaseClass {

	@Test
	public void changePassword () throws IOException, InterruptedException {
	
		driverinitialize();
		driver.get("http://115.244.148.118:8195/signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.name("email"));
		Thread.sleep(2000);
		email.click();
		Thread.sleep(1000);
		email.sendKeys("vivek.sale@plusinfosys.com");
		
		WebElement Password=driver.findElement(By.name("password"));
		Thread.sleep(2000);
		Password.click();
		Thread.sleep(1000);
		Password.sendKeys("Vivek@123");
		
		WebElement Loginbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/li[3]/button"));
		Thread.sleep(1000);
		Loginbtn.click();
		Thread.sleep(1000);
		
		WebElement Profile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		Thread.sleep(1000);
		Profile.click();
		System.out.println("Done");
		
		WebElement EditProfile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/ul/li[6]/a"));
		Thread.sleep(1000);
		EditProfile.click();
		
		WebElement changepassword=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div[2]/div[2]/div/form/div/div[6]/div[1]/span"));
		Thread.sleep(1000);
		changepassword.click();
		
		WebElement oldPassword=driver.findElement(By.xpath("//*[@id=\"oldPassword\"]"));
		Thread.sleep(1000);
		oldPassword.click();
		oldPassword.sendKeys("Vivek@123");
		
		WebElement newPassword=driver.findElement(By.xpath("//*[@id=\"newPassword\"]"));
		Thread.sleep(1000);
		newPassword.click();
		newPassword.sendKeys("Vivek@123");
		
		WebElement ConfirmPassword=driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
		Thread.sleep(1000);
		ConfirmPassword.click();
		ConfirmPassword.sendKeys("Vivek@123");
		
		WebElement Save=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/div[4]/button[1]"));
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);
		
		System.out.println("Password change successfully");
		
		driver.quit();
	}
}
