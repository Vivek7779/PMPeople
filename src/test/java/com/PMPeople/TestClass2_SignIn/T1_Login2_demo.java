package com.PMPeople.TestClass2_SignIn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class T1_Login2_demo extends BaseClass {

    @Test
    public void Login() throws IOException, InterruptedException {
        driverinitialize();
        driver.get("http://115.244.148.118:8195/signin");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.name("email"));
        Thread.sleep(3000);
        email.sendKeys("vivek.sale@plusinfosys.com");
        
        // Print the email entered
        System.out.println("Email entered: " + email.getAttribute("value"));

        WebElement Password = driver.findElement(By.name("password"));
        Thread.sleep(3000);
        Password.sendKeys("Vivek@123");

        // Print the password entered
        System.out.println("Password entered: " + Password.getAttribute("value"));

        WebElement Loginbtn = driver.findElement(By.xpath("//*[@id=\"root\"]/body/main/div/div/div/div/ul/form/li[3]/button"));
        Thread.sleep(3000);
        clickWithPause(Loginbtn);

        WebElement Profile = driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/a/span"));
        System.out.println("Done");
        clickWithPause(Profile);

        WebElement EditProfile = driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/ul/li[6]/a"));
        Thread.sleep(1000);
        clickWithPause(EditProfile);

        WebElement Logout = driver.findElement(By.xpath("//*[@id=\"headerbarDark\"]/div/ul/li[6]/div/button"));
        Thread.sleep(1000);
        Logout.click();
        Thread.sleep(1000);
        System.out.println("Log Out Successfully.");

        driver.quit();
    }
}
