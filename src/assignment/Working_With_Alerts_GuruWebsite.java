package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Alerts_GuruWebsite {

	public static void main(String[] args) {
		
			
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleClick).perform();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();

	}

}
