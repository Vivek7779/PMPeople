package com.PMPeople.TestClass5_DeactivateAccount;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T1_DeactivateAccount extends BaseClass{

	@Test
	public void deactivate() throws IOException, InterruptedException {
		
		driverinitialize();
		maximizeWindow();
		performLogin("vivek.sale@plusinfosys.com", "Vivek@123");
		
		WebElement Profile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		clickWithPause(Profile);
		System.out.println("Done");
		
		WebElement EditProfile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/ul/li[6]/a"));
		clickWithPause(EditProfile);
		
		WebElement Organizations=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div[2]/div[2]/div/form/div/div[6]/div[1]/button"));
		clickWithPause(Organizations);
		
		System.out.println("if user have 2 organizations then not able to Deactivate account.");
		
		WebElement DeactivateAccount=driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div[3]/div/div/div[3]/button"));
		clickWithPause(DeactivateAccount);
		
		System.out.println("User have only one organization.");
		
		WebElement ConfirmDeactivate=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
		clickWithPause(ConfirmDeactivate);
		
		System.out.println("User have only 1 Organization thats why account is deactivated.");
	}
}
