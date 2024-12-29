package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductAddToCartTest {
	

	@Test(groups = "functional")
	public void productAddToCartTest()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gana12@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("gana123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'button-2 product-box-add-to-cart-button')])[1]")).click();
	    driver.quit();
	}

}
