package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDisableElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement disabTextfield = driver.findElement(By.xpath("//input[@class='form-control']"));
		js.executeScript("arguments[0].value='Ganesh';",disabTextfield);
		Thread.sleep(2000);
		//driver.quit();
		
		

	}

}
