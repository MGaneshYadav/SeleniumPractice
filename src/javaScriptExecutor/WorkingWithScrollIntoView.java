package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement singapore = driver.findElement(By.xpath("//h5[text()='Singapore']"));
		js.executeScript("arguments[0].scrollIntoView(true)",singapore);
		js.executeScript("arguments[0].scrollIntoView(false)",singapore);
		Thread.sleep(2000);
		driver.quit();

	}

}
