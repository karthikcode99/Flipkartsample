package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipkartBase {
	WebDriver driver;
	FlipkartModel FlipkartOR;
	@Parameters({"Browser"})
	@BeforeClass
 public void browser(String Browser) {
		if(Browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\OneDrive\\Desktop\\ChromeDrivers\\chromedriver.exe");
		     driver=new ChromeDriver();
		 
		     driver.get("https://www.flipkart.com/");
		     
		}
			else  {
				System.out.println("Browser could not be found");
			}
		
		}
	
	@AfterClass
	public void closeBrowser() {
		 
	  driver.close();
	 }
}
