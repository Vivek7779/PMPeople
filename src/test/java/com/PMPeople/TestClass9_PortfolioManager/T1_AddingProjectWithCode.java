package com.PMPeople.TestClass9_PortfolioManager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T1_AddingProjectWithCode extends BaseClass{

	@Test
	public void addingProjectWithCode() throws IOException, InterruptedException {
		driverinitialize();
		maximizeWindow();
		performLogin("Vivek.sale@plusinfosys.com", "Vivek@123");
		
		 WebElement PfM=driver.findElement(By.xpath("//a[@href=\"/pmi/supply/portfoliomanager\"]"));
         clickWithPause(PfM);
         
         WebElement Selectprogram=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
         clickWithPause(Selectprogram);
         Selectprogram.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
         
         WebElement projects=driver.findElement(By.xpath("//*[@id=\"tabview\"]/div/ul/li[2]/a"));
         clickWithPause(projects);
         
         WebElement AddProject=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[1]/button"));
         clickWithPause(AddProject);
         
         WebElement Projectcode=driver.findElement(By.xpath("//*[@id=\"SubscriptionCode\"]"));
         Projectcode.sendKeys("4e229a42");
         
         WebElement Add=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/button[2]"));
         clickWithPause(Add);
        
         driver.navigate().refresh();
         
         WebElement Selectprogram1=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
         clickWithPause(Selectprogram1);
         Selectprogram1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
         
         WebElement projects1=driver.findElement(By.xpath("//*[@id=\"tabview\"]/div/ul/li[2]/a"));
         clickWithPause(projects1);
         
         System.out.println("Project Added Successfully");
         driver.quit();
	}
}
