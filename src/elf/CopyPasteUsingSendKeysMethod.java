package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteUsingSendKeysMethod {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/");
	WebElement emailTextfield = driver.findElement(By.id("email"));
	emailTextfield.sendKeys("ganesh");
	emailTextfield.sendKeys(Keys.CONTROL+"a");
	emailTextfield.sendKeys(Keys.CONTROL+"c");
	driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	driver.quit();
	
	}

}
