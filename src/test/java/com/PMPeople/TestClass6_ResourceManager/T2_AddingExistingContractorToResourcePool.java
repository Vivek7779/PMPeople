

package com.PMPeople.TestClass6_ResourceManager;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T2_AddingExistingContractorToResourcePool extends BaseClass {

	@Test
	public void ddingExistingContractorToResourcePool() throws IOException, InterruptedException {
		
		driverinitialize();
		maximizeWindow();
		performLogin("vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement ResourceManager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[5]/a"));
		clickWithPause(ResourceManager);
		
		WebElement SelectResourcePoolDropdown=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		clickWithPause(SelectResourcePoolDropdown);
		
		Select dropdown=new Select(SelectResourcePoolDropdown);
		dropdown.selectByIndex(6);
		driver.switchTo().activeElement().click();
		
		WebElement Pooldata=driver.findElement(By.xpath("//*[@id=\"tabview\"]/div/ul/li[1]/div"));
		clickWithPause(Pooldata);
		
		Thread.sleep(2000);
        
		WebElement AddExistingContractor=driver.findElement(By.xpath("//*[@id=\"tab_POOLDATA\"]/div/div/div[1]/div[6]/div/button[2]"));
		clickWithPause(AddExistingContractor);
		
		WebElement SelectResourcePool=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		clickWithPause(SelectResourcePool);
		SelectResourcePool.sendKeys(Keys.ARROW_DOWN);
		clickWithPause(SelectResourcePool);
		
		WebElement SelectContractor=driver.findElement(By.xpath("//*[@id=\"floatingSelectContractors\"]"));
		clickWithPause(SelectContractor);
		SelectContractor.sendKeys(Keys.ARROW_DOWN);
		clickWithPause(SelectContractor);
		
		WebElement save=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button[1]"));
		clickWithPause(save);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
