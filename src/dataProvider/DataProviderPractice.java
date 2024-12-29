package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@DataProvider
	public String[] sendData()
	{
		String arr[]= {"https://www.toyotabharat.com/","https://www.honda2wheelersindia.com/","https://www.heromotocorp.com/"};
		return arr;
		
	}
	
	@Test(dataProvider = "sendData")
	public void demoTest(String url)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.quit();
	}

}
