package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksInDemoWebShop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for(WebElement links:allLinks)
		{
			System.out.println(links.getAttribute("href")+"------->"+links.getText());
		}
		driver.quit();

	}

}
