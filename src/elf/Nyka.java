package elf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nyka {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/user/login");
		WebElement emailTextfield = driver.findElement(By.id("email"));
		emailTextfield.sendKeys("ganesh@gmail.com");
		System.out.println(emailTextfield.getAttribute("value"));
		driver.quit();
	
	}

}
