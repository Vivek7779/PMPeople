package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

    public static WebDriver driver;

    public void driverinitialize() throws IOException {
        // Here we gave the path of data.properties File.
        FileInputStream fis = new FileInputStream("D:\\Vivek\\Automation Testing\\pmpepople\\PMPeople\\src\\main\\java\\Resources\\data.properties");

        // To load properties.
        Properties prop = new Properties();
        prop.load(fis);

        // Create string to Store browser.
        String browserName = prop.getProperty("browser");

        // if else statement for cross-browser testing.
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else {
            System.out.println("You dont have an appropriate browser");
        }

        // Maximize the window
        maximizeWindow();
        
        // Navigate to the specified URL
        driver.get("http://115.244.148.118:8195/signin");
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    // Custom click method with a 2-second pause after each click
    public void clickWithPause(WebElement element) {
        element.click();
        try {
            Thread.sleep(2000); // Pause for 2 seconds after click
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void performLogin(String email, String password) throws InterruptedException {
        WebElement emailField = driver.findElement(By.name("email"));
        Thread.sleep(3000);
        emailField.sendKeys(email);
        System.out.println("Email entered: " + emailField.getAttribute("value"));

        WebElement passwordField = driver.findElement(By.name("password"));
        Thread.sleep(2000);
        passwordField.sendKeys(password);
        System.out.println("Password entered: " + passwordField.getAttribute("value"));

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='root']/body/main/div/div/div/div/ul/form/li[3]/button"));
        clickWithPause(loginBtn);
        System.out.println("Login Successful.");
    }
}
