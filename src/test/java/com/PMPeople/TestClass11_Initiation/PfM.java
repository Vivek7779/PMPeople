package com.PMPeople.TestClass11_Initiation;


import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class PfM extends BaseClass {
  @Test
	public void pfM() throws IOException, InterruptedException {
		
	  driverinitialize();
	  maximizeWindow();
	  performLogin("admin11@dummy.com", "Admin@123");
	  
	  WebElement PfM=driver.findElement(By.xpath("//*[@id=\"sideMenu\"]/a"));
	  clickWithPause(PfM);
	  
	  //Selecting Portfolio.
	  WebElement SelectPortfolio=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
	  Thread.sleep(2000);
	  clickWithPause(SelectPortfolio);
		  
	  Select portfolioDropdown=new Select(SelectPortfolio);
	  portfolioDropdown.selectByIndex(11);
	  Thread.sleep(2000);
	  SelectPortfolio.sendKeys(Keys.ESCAPE);	  
	  
	  //Selecting Project.
	  WebElement SelectProject=driver.findElement(By.xpath("//div[@class='px-4 py-4 page-body']//div//div[2]//div[1]//select[1]"));
	  clickWithPause(SelectProject);
	  Select ProjectDrop=new Select(SelectProject);
	  ProjectDrop.selectByIndex(2);
	  SelectProject.sendKeys(Keys.ESCAPE);
	  
	  //Initiation.
	  WebElement initiation=driver.findElement(By.xpath("//*[@id=\"tabview\"]/div/ul/li[4]/a"));
	  clickWithPause(initiation);
	  Thread.sleep(1000);
	  
      //Project Data
	  WebElement Projectdata=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[1]/div/ul/div/div"));
	  clickWithPause(Projectdata);
      
	  //Define
	  WebElement Define=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[1]/div/ul/li[1]"));
	  clickWithPause(Define);
/*
	  //Copy to clipboard.
	  WebElement PrivatProjectCode=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[2]/div[2]/button"));
	  clickWithPause(PrivatProjectCode);
	
	  //Project ID.
	  WebElement ProjectID=driver.findElement(By.xpath("//*[@id=\"Project ID\"]"));
      clickWithPause(ProjectID);
	  ProjectID.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
	  ProjectID.sendKeys("7985369", Keys.ENTER);
	  
	  //Project Short Name.
	  WebElement ProjectShortName=driver.findElement(By.xpath("//*[@id=\"Project Short Name\"]"));
	  clickWithPause(ProjectShortName);
	  ProjectShortName.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
	  ProjectShortName.sendKeys("Under_Testing_Project",Keys.ENTER);
	  Thread.sleep(3000);
	  
	  //Edit Project Name
	  WebElement projectName = driver.findElement(By.xpath("//*[@id=\"Project Name\"]"));
	  projectName.click();
	  projectName.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE, "1", Keys.ENTER);
	  projectName.sendKeys("Test_PN", Keys.ENTER);

	  // Scroll down to the element to ensure it is in view
	  Actions actions = new Actions(driver);
	  actions.moveToElement(projectName).sendKeys(Keys.PAGE_DOWN).build().perform();
  
	  //Change Project State
	  WebElement ProjectState=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[4]/div/select"));
	  ProjectState.click();
	  Select S=new Select(ProjectState);
	  S.selectByIndex(2);
	  ProjectState.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  WebElement Save=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]")); 
      Save.click();
      Thread.sleep(2000);
      
	  //Client.
	  WebElement Client=driver.findElement(By.name("Client_Name"));
	  Client.click();
      Select Clientdrop=new Select(Client);
      Clientdrop.selectByIndex(2);
      WebElement Save1=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save1.click();
 	
	  //Project Manager.
	  WebElement ProjectManager=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[7]/div/div[2]/select"));
	  clickWithPause(ProjectManager);
      Select PMdrop=new Select(ProjectManager);
      PMdrop.selectByIndex(3);
      ProjectManager.sendKeys(Keys.ENTER);
      WebElement Save2=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save2.click();	  
  	  
      //Requester.
	  WebElement Requester=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[8]/div/div[2]/select"));
	  Requester.click();
	  Thread.sleep(1000);
      Select Requesterdrop=new Select(Requester);
      Requesterdrop.selectByVisibleText("Ambit Proveedor");
      Thread.sleep(1000);
      Requester.sendKeys(Keys.ENTER);
      WebElement Save3=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save3.click();	  	  
*/		 
      //Sponsor.
	  WebElement Sponsor=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[9]/div/div[2]/select"));
	  Sponsor.click();
      Select Sponsordrop=new Select(Sponsor);
      Sponsordrop.selectByIndex(3);
      Sponsor.sendKeys(Keys.ENTER);
      Thread.sleep(1500);
      WebElement Save4=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save4.click();
      Thread.sleep(1500);
      
	  //Baseline Start
	  WebElement BaselineStart=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[11]/div[1]/div/div/input"));
	  BaselineStart.click();
	  BaselineStart.sendKeys(Keys.CONTROL+"A",Keys.DELETE,"2024-05-23",Keys.ENTER);
	  //BaselineStart.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB);
	  
	  //BaselineDuration
	  WebElement BaselineDuration=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[12]/div/input"));
	  BaselineDuration.sendKeys(Keys.CONTROL+ "A",Keys.DELETE,"89.09",Keys.ENTER);
 
	  //Baseline Finish
	  WebElement BaselineFinish=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[13]/div[1]/div"));
	  BaselineFinish.click();
	  BaselineFinish.sendKeys("2024-12-31");
	  BaselineFinish.sendKeys(Keys.PAGE_DOWN);
	  
	  // Scroll down by 500 pixels
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0, 1500)");

	  //Value.
	  WebElement Value=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[15]/div/input"));
	  Value.sendKeys(Keys.PAGE_DOWN);
	  Thread.sleep(2000);
	  Value.click();
	  Value.sendKeys("7",Keys.ENTER);
	  Thread.sleep(3000); 
	  
	  //Size.
	  WebElement Size=driver.findElement(By.cssSelector("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[16]/div/input"));
	  Size.click();
	  Size.sendKeys(Keys.CONTROL+"A",Keys.DELETE,"VXVML",Keys.ENTER);
	  Thread.sleep(3000); 	  
	  
	  //Risk Rate.
	  WebElement RiskRate=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[4]/div[13]/div/input"));
	  RiskRate.click();
	  RiskRate.sendKeys(Keys.CONTROL+"A",Keys.DELETE,"67",Keys.ENTER);
	  Thread.sleep(3000); 	  	  
	  
	  //Project Comment.
	  WebElement ProjectComment=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[4]/div[17]/div/textarea[1]"));
	  ProjectComment.click();
	  ProjectComment.sendKeys(Keys.CONTROL+"A",Keys.DELETE,"67",Keys.ENTER);
	  //Thread.sleep(3000); 
	
	 // driver.quit();
	  
	}
}
