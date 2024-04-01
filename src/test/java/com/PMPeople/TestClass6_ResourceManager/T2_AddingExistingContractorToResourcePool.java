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
		driver.get("http://115.244.148.118:8195/signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.name("email"));
		Thread.sleep(2000);
		email.click();
		Thread.sleep(3000);
		email.sendKeys("vivek.sale@plusinfosys.com");
		
		WebElement Password=driver.findElement(By.name("password"));
		Thread.sleep(2000);
		Password.click();
		Thread.sleep(3000);
		Password.sendKeys("Vivek@123");
		
		WebElement Loginbtn=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/li[3]/button"));
		Thread.sleep(2000);
		Loginbtn.click();
		Thread.sleep(2000);
		
		WebElement ResourceManager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[5]/a"));
		ResourceManager.click();
		Thread.sleep(2000);
		
		WebElement SelectResourcePoolDropdown=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
		SelectResourcePoolDropdown.click();
		Thread.sleep(2000);
		
		Select dropdown=new Select(SelectResourcePoolDropdown);
		dropdown.selectByIndex(6);
		
		WebElement Pooldata=driver.findElement(By.xpath("/html/body/div/body/main/div[3]/div[2]/div/ul/li[1]/a"));
		Pooldata.click();
		Thread.sleep(2000);
        
		WebElement AddExistingContractor=driver.findElement(By.xpath("//*[@id=\"tab_POOLDATA\"]/div/div/div[1]/div[2]/div/button[2]"));
		AddExistingContractor.click();
		
		WebElement SelectResourcePool=driver.findElement(By.xpath("//select[@name='selectedRPool']"));
		SelectResourcePool.click();
		Thread.sleep(1000);
		SelectResourcePool.sendKeys(Keys.ARROW_DOWN);
		SelectResourcePool.click();
		Thread.sleep(1000);
		
		WebElement SelectContractor=driver.findElement(By.xpath("//*[@id=\"floatingSelectContractors\"]"));
		SelectContractor.click();
		Thread.sleep(1000);
		SelectContractor.sendKeys(Keys.ARROW_DOWN);
		SelectContractor.click();
		Thread.sleep(3000);
		
		WebElement save=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/button[1]"));
		save.click();
		Thread.sleep(3000);
		
		WebElement DeleteAddedContractor=driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]/i"));
		DeleteAddedContractor.click();
		Thread.sleep(1000);
		
	
		Thread.sleep(3000);
		driver.quit();
		
	}
}
