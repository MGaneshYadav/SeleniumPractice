package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToPrintAllTextInSortBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
//		List<WebElement> sortBy = driver.findElements(By.id("products-orderby"));
//		//Select sel=new Select(sortBy)
//		for(WebElement items:sortBy)
//		{
//			System.out.println(items.getText());
//		}
		
		WebElement sortBy = driver.findElement(By.id("products-orderby"));
		Select sel=new Select(sortBy);
		List<WebElement> options = sel.getOptions();
		for(WebElement items:options)
		{			
			System.out.println(items.getText());
        }
		driver.quit();
		

	}

}
