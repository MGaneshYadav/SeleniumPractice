package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OnePageLoveScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://onepagelove.com/");
		Actions action=new Actions(driver);
		for(;;)
		{
			try
			{
				driver.findElement(By.linkText("Inside South East")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				action.scrollByAmount(0, 500).perform();
			}
		}
		
	}

}
