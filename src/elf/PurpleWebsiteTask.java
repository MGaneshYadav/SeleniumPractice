package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PurpleWebsiteTask {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.purplle.com/");
		Actions action=new Actions(driver);
		WebElement categories = driver.findElement(By.xpath("//a[contains(text(),'SHOP CATEGORIES')]"));
		action.moveToElement(categories).perform();
		driver.findElement(By.xpath("//a[@data-evlbl='Skin Care']")).click();
		driver.findElement(By.cssSelector(".label-default")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Good Vibes Rosehip Hydrating Glow Face Wash')]/../../../..//a[text()=' Add to Cart ']")).click();
		Thread.sleep(2000);
		driver.quit();		
	}

}
