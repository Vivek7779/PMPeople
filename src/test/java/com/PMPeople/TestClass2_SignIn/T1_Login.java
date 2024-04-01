package com.PMPeople.TestClass2_SignIn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import Resources.BaseClass;


public class T1_Login extends BaseClass  {

	@Test 
	public void Login() throws IOException, InterruptedException
	{
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
		Thread.sleep(5000);
		Loginbtn.click();
		Thread.sleep(3000);
		
		WebElement Profile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
		Thread.sleep(1000);
		Profile.click();
		System.out.println("Done");
		
		WebElement EditProfile=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/ul/li[6]/a"));
		Thread.sleep(1000);
		EditProfile.click();
		
		WebElement Logout=driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/button"));
		Thread.sleep(1000);
		Logout.click();
		Thread.sleep(1000);
		System.out.println("Log Out Successffully.");
		
		driver.quit();
	}
}
