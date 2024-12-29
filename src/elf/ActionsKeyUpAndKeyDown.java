package elf;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeyUpAndKeyDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://parivahan.gov.in/parivahan/");
		Actions action=new Actions(driver);
		List<WebElement> allNavBars = driver.findElements(By.xpath("//li[@data-type='menu_item' and @data-level='1']"));
		for(WebElement navEle:allNavBars)
		{
			//action.keyDown(Keys.CONTROL).perform();
			action.keyDown(Keys.SHIFT).perform();
			navEle.click();
			action.keyUp(Keys.SHIFT).perform();
			//action.keyUp(Keys.CONTROL).perform();
		}
		driver.quit();
	}

}
