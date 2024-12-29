package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesClicking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ganesh%20yadav/OneDrive/Desktop/HTML%20Custom%20Pages/demo%20(1).html");
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@name='download']"));
		for(WebElement box:checkbox)
		{
			box.click();
		}
		driver.quit();
	}

}
