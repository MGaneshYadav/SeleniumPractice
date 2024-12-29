package elf;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsMoveToElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		WebElement audioBar = driver.findElement(By.xpath("//div[text()='Audio']"));
		actions.moveToElement(audioBar);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement earphones = driver.findElement(By.xpath("//a[text()='Earphones']"));
		wait.until(ExpectedConditions.elementToBeClickable(earphones));
		earphones.click();

		//driver.quit();
	}

}
