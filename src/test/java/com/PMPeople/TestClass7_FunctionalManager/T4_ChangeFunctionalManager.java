package com.PMPeople.TestClass7_FunctionalManager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T4_ChangeFunctionalManager extends BaseClass {

	@Test
	public void changeFunctionalManager() throws IOException, InterruptedException {
		driverinitialize();
		maximizeWindow();
		performLogin("vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement FunctionalManager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[9]/a"));
		clickWithPause(FunctionalManager);
		
		WebElement SelectBusinessUnitDropdown=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		clickWithPause(SelectBusinessUnitDropdown);
		
		//Create a Select object for the dropdown
		Select dropdown=new Select(SelectBusinessUnitDropdown);
		
		dropdown.selectByIndex(1);
		clickWithPause(SelectBusinessUnitDropdown);
		
		WebElement BusinessUnitData=driver.findElement(By.xpath("//*[@id=\"tabview\"]/div/ul/li[1]/a"));
		clickWithPause(BusinessUnitData);
		
		WebElement functionalManagerdropdown=driver.findElement(By.name("fmName"));
		clickWithPause(functionalManagerdropdown);
	
		functionalManagerdropdown.sendKeys(Keys.ARROW_UP);
	    clickWithPause(functionalManagerdropdown);
		
		WebElement save=driver.findElement(By.xpath("//*[@id=\"tab_BUDATA\"]/div[1]/form/div[1]/div/div[2]/button"));
		clickWithPause(save);
		
		driver.navigate().refresh();
		
		WebElement SelectBusinessUnitDropdown1=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		
		driver.quit();
		
		
	
		
	}
}
