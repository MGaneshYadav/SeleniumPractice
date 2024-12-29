package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStackCheckButton {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='Levis Mens Regular Fit Tee']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560085");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement chechButton = driver.findElement(By.id("Check"));
		wait.until(ExpectedConditions.elementToBeClickable(chechButton));
		chechButton.click();
		
//		FluentWait fw=new FluentWait(driver);
//		fw.pollingEvery(Duration.ofSeconds(20));
//		fw.withTimeout(Duration.ofSeconds(15));
		
		
	}

}
