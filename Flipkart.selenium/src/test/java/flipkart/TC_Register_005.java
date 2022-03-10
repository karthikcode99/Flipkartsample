package flipkart;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Register_005 extends FlipkartBase {
@Test
public void userRegister() throws InterruptedException, IOException {
	
	FlipkartOR =new FlipkartModel(driver);
	Properties properties=new Properties();
	FileInputStream inputstream=new FileInputStream("C:\\Users\\karth\\eclipse-workspace\\Flipkart.selenium\\src\\test\\java\\com\\qa\\testdata\\credentails.properties");
	properties.load(inputstream);
	String Mobno=properties.getProperty("mobno2");
	

	FlipkartOR.getEmail().sendKeys(Keys.CONTROL + "a");
	FlipkartOR.getEmail().sendKeys(Keys.DELETE);

	FlipkartOR.getPassword().sendKeys(Keys.CONTROL + "a");
	FlipkartOR.getPassword().sendKeys(Keys.DELETE);
	Thread.sleep(3000);

	FlipkartOR.getEmail().sendKeys(Mobno);
	
	FlipkartOR.registeruser().click();
	
     
}

}
