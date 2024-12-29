package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Alert_RightClick_GuruWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions action=new Actions(driver);
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		List<WebElement> listOpations = driver.findElements(By.xpath("//ul/following::li/child::span"));
		for(WebElement e:listOpations)
		{
		action.contextClick(rightClick).perform();
		e.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		}
		driver.quit();

	}

}
