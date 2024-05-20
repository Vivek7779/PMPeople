package com.PMPeople.TestClass9_PortfolioManager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T1_AddingProjectWithCode extends BaseClass{

	@Test
	public void addingProjectWithCode() throws IOException, InterruptedException {
		driverinitialize();
		maximizeWindow();
		performLogin("Vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement portfoliomanager=driver.findElement(By.xpath("/html/body/div/body/main/aside/nav/div/div[2]/div/ul/li[9]/a"));
	    clickWithPause(portfoliomanager);
	  		
	  	WebElement SelectBusinessUnitDropdown=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
	  	clickWithPause(SelectBusinessUnitDropdown);
	  		
	    //Create a Select object for the dropdown
	    Select dropdown=new Select(SelectBusinessUnitDropdown);
	  	dropdown.selectByIndex(1);
	  	driver.switchTo().activeElement().click();
	  		 
	  	WebElement selectProject=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
	  	clickWithPause(selectProject);
	  		 
	    WebElement chooseproject=driver.findElement(By.xpath("/html/body/div/body/main/div[3]/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[2]/p"));
	    clickWithPause(chooseproject);
	    Thread.sleep(2000);
	          
	    WebElement ProjectData=driver.findElement(By.xpath("//*[@id=\"tab_CONTROL\"]/div/div[1]/div/div/ul/li[1]"));
	    clickWithPause(ProjectData);
	          
	    WebElement PrivateProjectCode_CopytoClipboard=driver.findElement(By.xpath("//*[@id=\"tab_CONTROL\"]/div/div[2]/div[2]/div/div[2]/div/form/div[1]/div[1]/button"));
	    clickWithPause(PrivateProjectCode_CopytoClipboard);
	         
		 WebElement PfM=driver.findElement(By.xpath("//a[@href=\"/pmi/supply/portfoliomanager\"]"));
         clickWithPause(PfM);
         
         WebElement Selectprogram=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
         clickWithPause(Selectprogram);
         Selectprogram.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
         
         WebElement projects=driver.findElement(By.xpath("//*[@id=\"tabview\"]/div/ul/li[2]/a"));
         clickWithPause(projects);
         
         WebElement AddProject=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[1]/button"));
         clickWithPause(AddProject);
         
         WebElement code=driver.findElement(By.xpath("//*[@id=\"SubscriptionCode\"]"));
         clickWithPause(code);
         code.sendKeys(Keys.CONTROL+"v");
         code.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
         
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
