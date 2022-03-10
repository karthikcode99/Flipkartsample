package flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_Logout_004 extends FlipkartBase{
	@Test

	public void logoutUser() throws InterruptedException{
		FlipkartOR =new FlipkartModel(driver);
		FlipkartOR.getEmail().sendKeys("7708029601");
		FlipkartOR.getPassword().sendKeys("@veni99");
		FlipkartOR.getloginButton().click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]"));

		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Logout')]")));


		WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Logout')]"));
		action.moveToElement(element2);

		action.click().build().perform();

	}
}
