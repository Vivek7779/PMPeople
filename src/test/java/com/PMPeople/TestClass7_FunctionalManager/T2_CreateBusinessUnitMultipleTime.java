package com.PMPeople.TestClass7_FunctionalManager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T2_CreateBusinessUnitMultipleTime extends BaseClass {

	@Test
	public void createBusinessUnitMultipleTime() throws IOException, InterruptedException {
		driverinitialize();
		maximizeWindow();
		performLogin("vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement FuinctionalManager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[9]/a"));
		clickWithPause(FuinctionalManager);
		
		WebElement AddBusinessUnit=driver.findElement(By.xpath("//*[@id=\"projectHeader\"]/div[3]/div/button"));
		clickWithPause(AddBusinessUnit);
		
		WebElement Name=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/div[1]/input"));
		clickWithPause(Name);
		Name.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Name.sendKeys("BU 1");
		System.out.println("BU Name entered: " + Name.getAttribute("value"));
		
		WebElement Description=driver.findElement(By.xpath("//*[@id=\"desc\"]"));
		clickWithPause(Description);
		Description.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Description.sendKeys("Test 1");
		System.out.println("BU Description entered: " + Description.getAttribute("value"));
		
		WebElement Save=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/div[3]/div[2]/button"));
		Save.click();
		Save.click();
		Thread.sleep(2000);
		
		WebElement SelectBusinessUnitDropdown=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		clickWithPause(SelectBusinessUnitDropdown);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
