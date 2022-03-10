package flipkart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class TC_FlipkartLogin_001 extends FlipkartBase{
	@Test

	public void login() throws IOException, InterruptedException  {	

		FlipkartOR =new FlipkartModel(driver);

		Properties properties=new Properties();
		FileInputStream inputstream=new FileInputStream("C:\\Users\\karth\\eclipse-workspace\\Flipkart.selenium\\src\\test\\java\\com\\qa\\testdata\\credentails.properties");
		properties.load(inputstream);
		String Mobno=properties.getProperty("mobno");
		String Pass=properties.getProperty("pass");

		FlipkartOR.getEmail().sendKeys(Keys.CONTROL + "a");
		FlipkartOR.getEmail().sendKeys(Keys.DELETE);

		FlipkartOR.getPassword().sendKeys(Keys.CONTROL + "a");
		FlipkartOR.getPassword().sendKeys(Keys.DELETE);
		Thread.sleep(3000);

		FlipkartOR.getEmail().sendKeys(Mobno);
		FlipkartOR.getPassword().sendKeys(Pass);
		FlipkartOR.getloginButton().click();

	}

	//			@DataProvider
	//			public String[][] getData() throws IOException {
	//	
	//				String xFile="C:\\Users\\karth\\eclipse-workspace\\Flipkart.selenium\\TestDataSheets\\TestingSheet.xlsx";
	//				String xSheet="TC_FlipkartLogin_Test001";
	//				int rowCount=ExcelUtility.getRowCount(xFile, xSheet);
	//				int cellCount=ExcelUtility.getCellCount(xFile, xSheet, rowCount);
	//				String[][] data=new String[rowCount][cellCount];
	//				for(int i=1;i<=rowCount;i++)
	//				{
	//					for(int j=0;j<cellCount;j++) {
	//						data[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i, j);
	//					}
	//				}
	//	
	//				return data;
	//			}	

}



