package com.PMPeople.TestClass4_EditProfile;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T2_ChangeName extends BaseClass {

	@Test
	public void changeNameUnderProfile() throws IOException, InterruptedException {
		
		driverinitialize();
		maximizeWindow();
		performLogin("vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement Profile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		Thread.sleep(1000);
		Profile.click();
		
		WebElement EditProfile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/ul/li[6]/a"));
		Thread.sleep(1000);
		EditProfile.click();
		
		WebElement FirstName=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div[2]/div[2]/div/form/div/div[1]/input"));
		clickWithPause(FirstName);
	    FirstName.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
		Thread.sleep(1000);
		FirstName.sendKeys("Vivek");
		FirstName.sendKeys(Keys.TAB,Keys.BACK_SPACE);
		driver.switchTo().activeElement().sendKeys("Sale");
		
		WebElement Save=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div[2]/div[2]/div/form/div/div[6]/div[2]/button"));
		clickWithPause(Save);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		WebElement Profile2=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		clickWithPause(Profile2);
		System.out.println("Done");
		
		Thread.sleep(1000);
		System.out.println("Name Changed Successfully");
		
		driver.quit();
	}
}
