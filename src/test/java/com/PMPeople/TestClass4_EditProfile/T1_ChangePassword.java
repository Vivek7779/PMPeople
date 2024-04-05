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
		maximizeWindow();
     	performLogin("vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement Profile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		clickWithPause(Profile);
		System.out.println("Done");
		
		WebElement EditProfile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/ul/li[6]/a"));
	    clickWithPause(EditProfile);
		
		WebElement changepassword=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div[2]/div[2]/div/form/div/div[6]/div[1]/span"));
		clickWithPause(changepassword);
		
		WebElement oldPassword=driver.findElement(By.xpath("//*[@id=\"oldPassword\"]"));
		clickWithPause(oldPassword);
		oldPassword.sendKeys("Vivek@123");
		
		WebElement newPassword=driver.findElement(By.xpath("//*[@id=\"newPassword\"]"));
		clickWithPause(newPassword);
		newPassword.sendKeys("Vivek@123");
		
		WebElement ConfirmPassword=driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
		clickWithPause(ConfirmPassword);
		ConfirmPassword.sendKeys("Vivek@123");
		
		WebElement Save=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/div[4]/button[1]"));
		clickWithPause(Save);
		Thread.sleep(2000);
		
		System.out.println("Password change successfully");
		
		driver.quit();
	}
}
