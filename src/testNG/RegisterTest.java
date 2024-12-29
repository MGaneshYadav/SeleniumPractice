package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	
	@Test(groups = "smoke")
	public void registerTest()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("gana");
		driver.findElement(By.id("LastName")).sendKeys("yadav");
		driver.findElement(By.id("Email")).sendKeys("gana12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("gana123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("gana123");
		driver.findElement(By.cssSelector(".button-1.register-next-step-button")).click();
		driver.quit();
	}

}
