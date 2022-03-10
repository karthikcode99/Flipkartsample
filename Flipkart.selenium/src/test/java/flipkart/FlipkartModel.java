package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartModel{

	WebDriver driver;

	public FlipkartModel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
	WebElement loginButton;

	public WebElement getloginButton() {
		return loginButton;

	}
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
	WebElement search;
	public WebElement searchField() {
		return search;

	}
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")
	WebElement close;
	public WebElement close() {
		return close;

	}

	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
	WebElement click;
	public WebElement clickSearch() {
		return click;

	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]")
	WebElement select;
	public WebElement selectProduct() {
		return select;

	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
	WebElement cart;
	public WebElement myCart() {
		return cart;

	}
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")
	WebElement place;
	public WebElement ordert() {
		return place;
	}
	@FindBy(xpath="//button[contains(text(),'Request OTP')]")
	WebElement Register;
	public WebElement registeruser() {
		return Register;
	}
}