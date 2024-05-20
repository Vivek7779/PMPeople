package com.PMPeople.TestClass10_TestFilter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import Resources.BaseClass;

public class T1_PfM extends BaseClass{

	@Test
	public void PfM() throws IOException, InterruptedException {
		
		driverinitialize();
		maximizeWindow();
		performLogin("admin11@dummy.com", "Admin@123");
	
		WebElement PfM=driver.findElement(By.xpath("//*[@id=\"sideMenu\"]/a"));
	    clickWithPause(PfM);
	    
	    WebElement SelectPortfolio=driver.findElement(By.xpath("//*[@id=\"floatingSelect\"]"));
	    Thread.sleep(2000);
	    clickWithPause(SelectPortfolio);
	
	    Select projectDropdown=new Select(SelectPortfolio);
	    projectDropdown.selectByIndex(11);
	    Thread.sleep(2000);
	    SelectPortfolio.sendKeys(Keys.ESCAPE);

	    //Filter The projects By Project State.
	    WebElement Filter=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter);
	    
		WebElement ProjectStateDropdown=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[1]/div/div"));
		ProjectStateDropdown.click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("i",Keys.ENTER);
		
		WebElement Apply=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply);
		Thread.sleep(2000);
		
		WebElement Filter1=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter1);
	    WebElement ClearFilter=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter);	
		
		//Filter The projects By Traffic Light Color.
		WebElement Filter2=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter2);
	    
	    WebElement TrafficLightColour=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[2]/div/div"));
	    clickWithPause(TrafficLightColour);
	    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    WebElement Apply1=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply1);
		Thread.sleep(2000);
		
		WebElement Filter3=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter3);
	    
	    WebElement ClearFilter1=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter1);	
	
		//Filter The Projects by Business Unit.	
		WebElement Filter4=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter4);
	    
	    WebElement SelectBusinessUnit=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[3]/div/div"));
	    clickWithPause(SelectBusinessUnit);
	    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	    WebElement Apply2=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply2);
		Thread.sleep(2000);
		
		WebElement Filter5=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter5);
	    
	    WebElement ClearFilter2=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter2);	
		
		//Filter The Projects by Resource Pool.
		WebElement Filter6=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter6);
	    
	    WebElement SelectResourcePool=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[4]/div/div"));
	    clickWithPause(SelectResourcePool);
	    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	    WebElement Apply3=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply3);
		Thread.sleep(2000);
		
		WebElement Filter7=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter7);
	    
	    WebElement ClearFilter3=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter3);	
		                                             
		//Filter The Projects by PM Assistant.
		WebElement Filter8=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter8);
	    
	    WebElement SelectPMAssistant=driver.findElement(By.xpath("/html/body/div/body/main/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[5]/div/select"));
	    clickWithPause(SelectPMAssistant);
	    driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	    Thread.sleep(3000);
	    
	    WebElement Apply4=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply4);
		Thread.sleep(2000);
		
		WebElement Filter9=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter9);
	    
	    WebElement ClearFilter4=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter4);	
		
		//Filter The Projects by Client.
	    WebElement Filter10=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter10);
	    
	    WebElement Client=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[6]/div/div"));
	    clickWithPause(Client);
	    driver.switchTo().activeElement().sendKeys(Keys.ENTER,Keys.ESCAPE);
	    
	    WebElement Apply5=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply5);
		Thread.sleep(2000);
	    
		WebElement Filter11=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter11);
	    
	    WebElement ClearFilter5=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter5);	
	  	    
	    //Filter The Projects by Project Manager.
	    WebElement Filter12=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter12);
	    
	    WebElement ProjectManager=driver.findElement(By.xpath("/html/body/div/body/main/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[7]/div/select "));
	    clickWithPause(ProjectManager);
	    driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER,Keys.ESCAPE);
	    
	    WebElement Apply6=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply6);
		Thread.sleep(2000);
	    
		WebElement Filter13=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter13);
	    
	    WebElement ClearFilter6=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter6);
	   
	    
	    //Filter The Projects by Phase.
	    WebElement Filter14=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter14);
	    
	    WebElement Phase=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[8]/div/div"));
	    clickWithPause(Phase);
	    driver.switchTo().activeElement().sendKeys(Keys.ENTER,Keys.ESCAPE);
	    
	    WebElement Apply7=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply7);
		Thread.sleep(2000);
	    
		WebElement Filter15=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter15);
	    
	    WebElement ClearFilter7=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter7);
	    
	    
	    //Filter The Projects by Tag.
	    WebElement Filter16=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter16);
	    
	    WebElement Tag=driver.findElement(By.xpath("/html/body/div/body/main/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[9]/div/div"));
	    clickWithPause(Tag);
	    Thread.sleep(1000);
	    driver.switchTo().activeElement().sendKeys(Keys.ENTER,Keys.ESCAPE);
	    
	    WebElement Apply8=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply8);
		Thread.sleep(2000);
	    
		WebElement Filter17=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter17);
	    
	    WebElement ClearFilter8=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter8);
	   
	  
	    //Filter The Projects Within Value greater or Equal & with Smaller or Equal value.
	    WebElement Filter18=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter18);
	    
	    WebElement ValueGreaterOrEqual=driver.findElement(By.xpath("/html/body/div/body/main/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[11]/div/input"));
	    clickWithPause(ValueGreaterOrEqual);
	    ValueGreaterOrEqual.sendKeys("1");
	    
	    WebElement ValueSmallerOrEqual=driver.findElement(By.xpath("/html/body/div/body/main/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[12]/div/input"));
	    clickWithPause(ValueSmallerOrEqual);
	    ValueSmallerOrEqual.sendKeys("500");
	    
	    WebElement Apply9=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply9);
		Thread.sleep(2000);
	    
		WebElement Filter19=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter19);
	    
	    WebElement ClearFilter9=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter9);

	    //Filter The Projects Within Start & Finish Date.
	    WebElement Filter20=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter20);
	   
	    WebElement StartDate=driver.findElement(By.xpath("/html/body/div/body/main/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[13]/div[1]/div/div/input"));
	    clickWithPause(StartDate);
	    StartDate.sendKeys("2018-02-25");
	    
	    WebElement FinishDate=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[14]/div[1]/div/div/input"));
	    //clickWithPause(FinishDate);
	    FinishDate.sendKeys("2018-05-14");
	    
	    WebElement Apply10=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply10);
		Thread.sleep(2000);
	    
		WebElement Filter21=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter21);
	    
	    WebElement ClearFilter10=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter10);
	    
	    //Filter The Projects with Project Size.
	    WebElement Filter22=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter22);
	    
	    WebElement ProjectSize=driver.findElement(By.xpath("/html/body/div/body/main/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[15]/div/input"));
	    clickWithPause(ProjectSize);
	    ProjectSize.sendKeys("XML");
	    
	    WebElement Apply11=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[2]"));
		Thread.sleep(2000);
		clickWithPause(Apply11);
		Thread.sleep(2000);
	    
		WebElement Filter23=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]"));
	    clickWithPause(Filter23);
	    
	    WebElement ClearFilter11=driver.findElement(By.xpath("//*[@id=\"tab_PROJECTS\"]/div[1]/div[2]/div[3]/div/div/div/div/div[16]/button[1]"));
	    clickWithPause(ClearFilter11);
	  
	    driver.quit();
	}
	
}
