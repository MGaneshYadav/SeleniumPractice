package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithLoginUsingDataProvider {
	
	@Test(dataProvider = "loginData")
	public void loginTest(String username,String password)
	{
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.quit();
	}
	@DataProvider(name="loginData",parallel = true)
	public Object[][] testData()
	{
		Object data[][]=new Object[2][2];
		data[0][0]="ganesh";
		data[0][1]="yadav";
		data[1][0]="khaja";
		data[1][1]="pinjari";
		return data;
	}

}
