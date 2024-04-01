package com.PMPeople.TestClass6_ResourceManager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T1_AddResourcePool extends BaseClass{

	@Test
	public void addResourcePool() throws IOException, InterruptedException {
		
		driverinitialize();
		 
		driver.get("http://115.244.148.118:8195/signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.name("email"));
		Thread.sleep(2000);
		clickWithPause(email);
		email.sendKeys("vivek.sale@plusinfosys.com");
		
		WebElement Password=driver.findElement(By.name("password"));
		clickWithPause(Password);
		Password.click();
		Password.sendKeys("Vivek@123");
		
		WebElement Loginbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/li[3]/button"));
		clickWithPause(Loginbtn);
		
		WebElement ResourceManager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[5]/a"));
		clickWithPause(ResourceManager);
		
		WebElement AddResourcePool=driver.findElement(By.xpath("//*[@id=\"projectHeader\"]/div[6]/button"));
		clickWithPause(AddResourcePool);
		
		WebElement ResourcePoolName=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/div[1]/input"));
		clickWithPause(ResourcePoolName);
		ResourcePoolName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		ResourcePoolName.sendKeys("Demo 6");
		
		WebElement ResourcePoolDescription=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/div[2]/input"));
		clickWithPause(ResourcePoolDescription);
		ResourcePoolDescription.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		ResourcePoolDescription.sendKeys("Test 6");
		
		WebElement save=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button[1]"));
		clickWithPause(save);
		
		WebElement SelectResourcePoolDropdown=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		clickWithPause(SelectResourcePoolDropdown);
		
		System.out.println("Resource Pool Created Successfuly.");
		driver.quit();
		
		
		
	}
}
