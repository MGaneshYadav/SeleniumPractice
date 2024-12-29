package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithAccertions {
	
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert ast=new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		ast.assertEquals(driver.getTitle(), "emo Web Shop");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gana12@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("gana123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		driver.quit();
		ast.assertAll();	
		
		
		//Assert.assertTrue(false, "user is not logged in"); Hard assert
		//Assert.assertTrue(true, "user is not logged in");// Hard assert
	}
}
