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
	  ProjectDrop.selectByIndex(3);
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

	  //Copy to clipboard.
	  WebElement PrivatProjectCode=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[2]/div[2]/button"));
	  clickWithPause(PrivatProjectCode);
/*  
	  //Project ID.
	  WebElement ProjectID=driver.findElement(By.xpath("//*[@id=\"Project ID\"]"));
      clickWithPause(ProjectID);
	  ProjectID.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
	  ProjectID.sendKeys("7985369", Keys.ENTER);
	  System.out.println("Project ID entered: " + ProjectID.getAttribute("value"));
	  
	  //Project Short Name.
	  WebElement ProjectShortName=driver.findElement(By.xpath("//*[@id=\"Project Short Name\"]"));
	  clickWithPause(ProjectShortName);
	  ProjectShortName.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
	  ProjectShortName.sendKeys("Under_Testing_Project",Keys.ENTER);
	  System.out.println("Project Short Name entered: " + ProjectShortName.getAttribute("value"));
	  Thread.sleep(3000);
	  
	  //Edit Project Name
	  WebElement projectName = driver.findElement(By.xpath("//*[@id=\"Project Name\"]"));
	  clickWithPause(projectName);
	  projectName.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE, "1", Keys.ENTER);
	  projectName.sendKeys("Test_PN", Keys.ENTER);
	  System.out.println("Project Name entered: " + projectName.getAttribute("value"));
	  
	  //Change Project State
	  WebElement ProjectState=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[4]/div/select"));
	  clickWithPause(ProjectState);
	  Select S=new Select(ProjectState);
	  S.selectByIndex(2);
	  ProjectState.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  WebElement Save=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]")); 
      Save.click();
      Thread.sleep(2000);
      
	  //Client.
	  WebElement Client=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[5]/div/select"));
	  clickWithPause(Client);
      Select Clientdrop=new Select(Client);
      Clientdrop.selectByIndex(3);
      WebElement Save1=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[5]/div/select"));
      Save1.click();
 	
	  //Project Manager.
	  WebElement ProjectManager=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[7]/div/div[2]/select"));
	  clickWithPause(ProjectManager);
      Select PMdrop=new Select(ProjectManager);
      PMdrop.selectByIndex(4);
      ProjectManager.sendKeys(Keys.ENTER);
      WebElement Save2=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save2.click();	  
  	  
      //Requester.
	  WebElement Requester=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[8]/div/div[2]/select"));
	  clickWithPause(Requester);
      Select Requesterdrop=new Select(Requester);
      Requesterdrop.selectByVisibleText("Ambit Proveedor");
      Thread.sleep(1000);
      Requester.sendKeys(Keys.ENTER);
      WebElement Save3=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      clickWithPause(Save3);
 */     
      //Sponsor.
	  WebElement Sponsor=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[9]/div/div[2]/select"));
	  clickWithPause(Sponsor);
      Select Sponsordrop=new Select(Sponsor);
      Sponsordrop.selectByIndex(3);
      WebElement Save4=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      clickWithPause(Save4);
      Thread.sleep(1500);
      
      // Scroll down to the element to ensure it is in view
	  Actions actions = new Actions(driver);
	  actions.moveToElement(Sponsor).sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(1500);
 
	  //Baseline Start
	  WebElement BaselineStart=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[11]/div[1]/div/div/input"));
	  clickWithPause(BaselineStart);
	  BaselineStart.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	  BaselineStart.sendKeys("2024-05-23",Keys.ENTER);
	  System.out.println("Baseline Start entered: " + BaselineStart.getAttribute("value"));
	 
	  //BaselineDuration
	  WebElement BaselineDuration=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[12]/div/input"));
	  BaselineDuration.sendKeys(Keys.CONTROL+ "A",Keys.DELETE);
	  BaselineDuration.sendKeys("89.09",Keys.ENTER);
      Thread.sleep(2000);
      System.out.println("Baseline Duration entered: " + BaselineDuration.getAttribute("value"));
     
	  //Baseline Finish
	  WebElement BaselineFinish=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[13]/div[1]/div"));
	  clickWithPause(BaselineFinish);
	  BaselineFinish.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	  BaselineFinish.sendKeys("2024-12-31");
	  Thread.sleep(1500);
	  BaselineDuration.sendKeys(Keys.ENTER);
	  System.out.println("Baseline Finish entered: " + BaselineFinish.getAttribute("value"));
 	  
	  //Baseline Cost
	  WebElement Baselinecost=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[14]/div/input"));
	  clickWithPause(Baselinecost);
	  Baselinecost.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	  Baselinecost.sendKeys("9807.09",Keys.ENTER);
	  
	  //Value.
	  WebElement Value=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[15]/div/input"));
	  clickWithPause(Value);
	  Value.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	  Value.sendKeys("7",Keys.ENTER);
	  Thread.sleep(2000);
	 
	  //Size.
	  WebElement Size=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[16]/div/input"));
	  clickWithPause(Size);
	  Size.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	  Size.sendKeys("VXVML",Keys.ENTER); 
	  Thread.sleep(2000);
	  
	  //Risk Rate.
	  WebElement RiskRate=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[17]/div/input"));
	  clickWithPause(RiskRate);
	  RiskRate.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	  RiskRate.sendKeys("67",Keys.ENTER);
	  Thread.sleep(3000); 	  	  
	
	  //Probablity.
	  WebElement Probablity=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[18]/div/input"));
	  clickWithPause(Probablity);
	  Probablity.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	  Probablity.sendKeys("89",Keys.ENTER);
	  Thread.sleep(2000);
	  
	  //Project Comment.
	  WebElement ProjectComment=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[19]/div/textarea[1]"));
	  clickWithPause(ProjectComment);
	  ProjectComment.sendKeys(Keys.CONTROL+"A",Keys.DELETE);
	  ProjectComment.sendKeys("67",Keys.ENTER);
	  Thread.sleep(2000);
	  
	  driver.quit();
	    
	}
}
