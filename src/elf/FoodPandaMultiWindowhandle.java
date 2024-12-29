package elf;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FoodPandaMultiWindowhandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.foodpanda.com/");
		Actions action=new Actions(driver);
		List<WebElement> allNavBars = driver.findElements(By.xpath("//ul[@id='menu-primary']/li/a[contains(@href,'/')]"));
		
		for(WebElement navEle:allNavBars)
		{
			action.keyDown(Keys.CONTROL).perform();
			navEle.click();
			action.keyUp(Keys.CONTROL).perform();

		}
		String parent = driver.getWindowHandle();
		Set<String> childWindows = driver.getWindowHandles();
		for(String window:childWindows)
		{
			driver.switchTo().window(window);
			String title="panda ads | foodpanda | food and more, delivered";
			if(driver.getTitle().equals(title))
			{
			  driver.close();
			}
			driver.switchTo().window(parent);
		}
	}

}
