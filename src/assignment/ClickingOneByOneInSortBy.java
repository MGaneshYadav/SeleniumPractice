package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickingOneByOneInSortBy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ganesh%20yadav/OneDrive/Desktop/HTML%20Custom%20Pages/demo%20(1).html");
		WebElement sortBy = driver.findElement(By.id("standard_cars"));
		Select sel=new Select(sortBy);
		List<WebElement> options = sel.getOptions();
//		for(int i=0;i<options.size();i++)
//		{
//			sel.selectByIndex(i);
//			Thread.sleep(1000);
//		}
		for(WebElement ele:options)
		{
			sel.selectByVisibleText(ele.getText());
			Thread.sleep(1000);
		}
		driver.quit();

	}

}
