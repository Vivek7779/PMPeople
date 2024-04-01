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
		driver.get("http://115.244.148.118:8195/signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.name("email"));
		Thread.sleep(2000);
		email.click();
		Thread.sleep(2000);
		email.sendKeys("vivek.sale@plusinfosys.com");
		
		WebElement Password=driver.findElement(By.name("password"));
		Thread.sleep(2000);
		Password.click();
		Thread.sleep(2000);
		Password.sendKeys("Vivek@123");
		
		WebElement Loginbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/li[3]/button"));
		Thread.sleep(2000);
		Loginbtn.click();
		Thread.sleep(2000);
		
		WebElement Profile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		Thread.sleep(1000);
		Profile.click();
		
		WebElement EditProfile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/ul/li[6]/a"));
		Thread.sleep(1000);
		EditProfile.click();
		
		WebElement FirstName=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div[2]/div[2]/div/form/div/div[1]/input"));
		Thread.sleep(1000);
	    FirstName.click();
	    FirstName.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
		Thread.sleep(1000);
		FirstName.sendKeys("Vivek");
		FirstName.sendKeys(Keys.TAB,Keys.BACK_SPACE);
		driver.switchTo().activeElement().sendKeys("Sale");
		
		WebElement Save=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div[2]/div[2]/div/form/div/div[6]/div[2]/button"));
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		WebElement Profile2=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		Thread.sleep(1000);
		Profile2.click();
		System.out.println("Done");
		
		Thread.sleep(1000);
		System.out.println("Name Changed Successfully");
		
		driver.quit();
	}
}
