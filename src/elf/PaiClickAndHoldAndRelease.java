package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaiClickAndHoldAndRelease {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
		Actions action=new Actions(driver);
		WebElement slideFrom = driver.findElement(By.xpath("//span[contains(@class,'slider from')]"));
		WebElement slideTo = driver.findElement(By.xpath("//span[contains(@class,'slider to')]"));
//		action.dragAndDropBy(slideFrom, 45, 0).perform();
//		action.dragAndDropBy(slideTo, -45, 0).perform();
//		action.clickAndHold(slideFrom).moveByOffset(30, 0).release().perform();
		action.moveToElement(slideFrom).clickAndHold().moveByOffset(40, 0).release().perform();

	}

}
