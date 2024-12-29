package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithScrollBy {

	static JavascriptExecutor js;
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		typeCasting();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		scrollByJS("0" ,"3000");
		Thread.sleep(2000);
		driver.quit();
		
	}
	public static void typeCasting()
	{
		js=(JavascriptExecutor) driver;
	}
	public static void scrollByJS(String x,String y)
	{
		typeCasting();
		js.executeScript("window.scrollBy("+x+","+y+");");
	}

}
