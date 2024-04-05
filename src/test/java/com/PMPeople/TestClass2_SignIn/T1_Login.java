
package com.PMPeople.TestClass2_SignIn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import Resources.BaseClass;


public class T1_Login extends BaseClass  {

	@Test 
	public void Login() throws IOException, InterruptedException
	{
		driverinitialize();
		maximizeWindow();
		performLogin("vivek.sale@plusinfosys.com", "Vivek@123");
		 
		WebElement Profile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		clickWithPause(Profile);
		
		WebElement EditProfile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/ul/li[6]/a"));
		clickWithPause(EditProfile);
		
		WebElement Logout=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/button"));
		clickWithPause(Logout);
		System.out.println("Log Out Successffully.");
		
		driver.quit();
	}
}
