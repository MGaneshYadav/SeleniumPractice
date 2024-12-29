package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookGetLocation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement emailTextbox = driver.findElement(By.className("_6lux"));
		System.out.println(emailTextbox.getTagName());
		WebElement passwordTexbox = driver.findElement(By.id("passContainer"));
		Point emailLoc = emailTextbox.getLocation();
		Point passLoc = passwordTexbox.getLocation();
		System.out.println(emailLoc.getX());
		System.out.println(passLoc.getX());
		
		if(emailLoc.getX()==passLoc.getX())
		{
			System.out.println("X is Aligned Properly");
		}
		else
		{
			System.out.println("X is Not Aligned");
		}
		System.out.println(emailLoc.getY());
		System.out.println(passLoc.getY());
		if(emailLoc.getY()==passLoc.getY())
		{
			System.out.println("Y is Aligned Properly");
		}
		else
		{
			System.out.println("Y is Not Aligned");
		}
		driver.quit();
		
	}

}
