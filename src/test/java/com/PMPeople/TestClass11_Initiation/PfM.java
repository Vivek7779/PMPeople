package com.PMPeople.TestClass11_Initiation;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	  PrivatProjectCode.click();
	
	  //Project ID.
	  WebElement ProjectID=driver.findElement(By.xpath("//*[@id=\"Project ID\"]"));
	  ProjectID.click();
	  ProjectID.sendKeys("1",Keys.ENTER);
	  Thread.sleep(3000);  
	  
	  //Project Short Name.
	  WebElement ProjectShortName=driver.findElement(By.xpath("//*[@id=\"Project Short Name\"]"));
	  ProjectShortName.click();
	  ProjectShortName.sendKeys("Test_PSN",Keys.ENTER);
	  Thread.sleep(3000);
	  
	  //Edit Project Name.
	  WebElement ProjectName=driver.findElement(By.xpath("//*[@id=\"Project Name\"]"));
	  ProjectName.click();
	  ProjectName.sendKeys("Test_PN",Keys.ENTER);
	  Thread.sleep(2000);
	  
	  //Change Project State
	  WebElement ProjectState=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[3]/div[4]/div/select"));
	  ProjectState.click();
	  Select S=new Select(ProjectState);
	  S.selectByIndex(2);
	  ProjectState.sendKeys(Keys.ENTER);
 
	  //Client.
	  WebElement Client=driver.findElement(By.name("Client_Name"));
	  Client.click();
      Select Clientdrop=new Select(Client);
      Clientdrop.selectByIndex(2);
      Client.sendKeys(Keys.ENTER);
      WebElement Save=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save.click();
 */	   	
      //Contract Type.(this option is not there ,field changes as Request Name)
	  WebElement RequestName=driver.findElement(By.xpath("//*[@id=\"Request Name\"]"));
	  RequestName.click();
      RequestName.sendKeys(Keys.CONTROL + "A",Keys.DELETE,"RN");
      WebElement Save1=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save1.click(); 
	  
	  //Project Manager.
	  WebElement ProjectManager=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[4]/div[6]/div/div[2]/select"));
	  ProjectManager.click();
      Select PMdrop=new Select(ProjectManager);
      PMdrop.selectByIndex(4);
      ProjectManager.sendKeys(Keys.ENTER);
      WebElement Save2=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save2.click();	  
	  
      //Requester.
	  WebElement Requester=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[4]/div[7]/div/div[2]/select"));
	  Requester.click();
      Select Requesterdrop=new Select(Requester);
      Requesterdrop.selectByIndex(4);
      Requester.sendKeys(Keys.ENTER);
      WebElement Save3=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save3.click();	  	  

      //Sponsor.
	  WebElement Sponsor=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[4]/div[7]/div/div[2]/select"));
	  Sponsor.click();
      Select Sponsordrop=new Select(Sponsor);
      Sponsordrop.selectByIndex(3);
      Sponsor.sendKeys(Keys.ENTER);
      WebElement Save4=driver.findElement(By.xpath("//*[@id=\"tab_INITIATION\"]/div/div[2]/div/div/div[2]/div/form/fieldset/div[1]/div[2]/div/button[2]"));
      Save4.click();
	  
      //Value.
	  WebElement Value=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[4]/div[13]/div/input"));
	  Value.click();
	  Value.sendKeys("5",Keys.ENTER);
	  Thread.sleep(3000); 
	  
	  //Size.
	  WebElement Size=driver.findElement(By.xpath("/html/body/div[1]/body/main/div[3]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/form/fieldset/div[4]/div[14]/div/input"));
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
	  Thread.sleep(3000); 
	  
	  driver.quit();
	  
	}
}
