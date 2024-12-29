package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//driver.findElement(By.id("hide-textbox")).click();
	    WebElement hiddenTextfield = driver.findElement(By.id("displayed-text"));
		js.executeScript("arguments[0].value='Ganesh';",hiddenTextfield);
		Thread.sleep(2000);
		driver.quit();

	}

}
