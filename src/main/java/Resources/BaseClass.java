package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

  public static WebDriver driver;
	
	public void driverinitialize() throws IOException {
		
		//Here we gave path of data.proprties File.
		FileInputStream fis=new FileInputStream("C:\\Users\\Plusinfosys\\eclipse-workspace\\PMPeoplenew\\src\\main\\java\\Resources\\data.properties");
	    
		//To load properties.
		Properties prop=new Properties();
		prop.load(fis);
		
		//Create string to Store browser.
		String browserName=prop.getProperty("browser");
		
		//if else statement for cross browser testing.
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Safari")) {
			driver=new SafariDriver();
		}
		
		else {
			System.out.println("You dont have a appropriate browser");
		}
		
	}
		
		// Custom click method with a 20-second pause after each click
	    public void clickWithPause(WebElement element) {
	        element.click();
	        try {
	            Thread.sleep(2000); // Pause for 20 seconds after click
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
}
}