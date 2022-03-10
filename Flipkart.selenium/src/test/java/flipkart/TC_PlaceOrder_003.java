package flipkart;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class TC_PlaceOrder_003 extends FlipkartBase{

	
	@Test 
  public void orderPlace() throws InterruptedException{
		FlipkartOR =new FlipkartModel(driver);
		Thread.sleep(3000);
		FlipkartOR.close().click();	   
		FlipkartOR.searchField().sendKeys("iphone 12");
		FlipkartOR.clickSearch().click();
		Thread.sleep(3000);
		FlipkartOR.selectProduct().click();
		Thread.sleep(3000);
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list= new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		
		FlipkartOR.myCart().click();
		Thread.sleep(3000);
		FlipkartOR.ordert().click();
		Thread.sleep(3000);
		
	}
}
