package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElementOffSet {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ganesh");
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(password,290,0).click().perform();
		
	}

}
