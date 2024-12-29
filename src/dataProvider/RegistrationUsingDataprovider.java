package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationUsingDataprovider {
	
	@DataProvider
	public String[][] sendData()
	{
		String arr[][]= {{"ganesh","yadav","ganesh1234@gmail.com","gana123","gana123"}};
		return arr;
		
	}
	
	@Test(dataProvider = "sendData")
	public void demoTest(String [] credentials)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		
		driver.quit();
	}

}
