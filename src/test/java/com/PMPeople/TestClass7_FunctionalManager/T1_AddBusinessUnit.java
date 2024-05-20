package com.PMPeople.TestClass7_FunctionalManager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T1_AddBusinessUnit extends BaseClass{

	@Test
	public void addBusinessUnit() throws IOException, InterruptedException {
		driverinitialize();
		maximizeWindow();
		performLogin("vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement FunctionalManager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[9]/a"));
		clickWithPause(FunctionalManager);
		
		WebElement AddBusinessUnit=driver.findElement(By.xpath("//*[@id=\"projectHeader\"]/div[4]/div/button"));
		clickWithPause(AddBusinessUnit);                      
		
		WebElement Save=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/div[3]/div[2]/button"));
		
		
		Thread.sleep(2000);
		
		System.out.println("Save button disabled,means without giving any details resource pool not created");
		driver.quit();
		
	}
}
