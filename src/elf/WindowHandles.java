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

public class WindowHandles {

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
			action.keyDown(Keys.CONTROL).perform();
			navEle.click();
			action.keyUp(Keys.CONTROL).perform();

		}
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String e:child)
		{
			driver.switchTo().window(e);
			String title="Site map | Parivahan Sewa | Ministry of Road Transport & Highways, Government of India";
			if(driver.getTitle().equals(title))
			{
			driver.close();
			}
			System.out.println(driver.getTitle());
		}
		

	}

}
