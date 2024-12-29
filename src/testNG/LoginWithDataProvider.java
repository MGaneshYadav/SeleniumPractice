package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataProvider {
	
	@Test(dataProvider = "loginData")
	public void datadrivenTesting(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.quit();
	}
	
	@DataProvider(name ="loginData")
	public Object[][] loginData()
	{
		Object data[][]=new Object[2][2];
		data[0][0]="ganesh@gmail.com";
		data[0][1]="gana123";
		data[1][0]="pranith@gmail.com";
		data[1][1]="pranith123";
		return data;
	}

}
