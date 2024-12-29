package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> radio_buttons = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<radio_buttons.size();i++)
		{
			radio_buttons.get(i).click();
			Thread.sleep(1000);
		}
		
		for(WebElement element:radio_buttons)
		{
			element.click();
			Thread.sleep(1000);
		}
		driver.quit();

	}

}
