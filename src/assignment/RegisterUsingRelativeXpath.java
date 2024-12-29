package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUsingRelativeXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ganesh");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("yadav");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ganesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("ganesh");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("ganesh");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.quit();
	}

}
