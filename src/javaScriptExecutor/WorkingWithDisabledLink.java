package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDisabledLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.xpath("(//a[@class='license-link icn-lock'])[3]")).click();
	    WebElement hiddenLink = driver.findElement(By.xpath("//a[contains(@class,'download-file icn-lock')]"));
		js.executeScript("arguments[0].click();",hiddenLink);
		Thread.sleep(2000);
		driver.quit();

	}

}
