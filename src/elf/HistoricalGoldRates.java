package elf;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HistoricalGoldRates {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		List<WebElement> days = driver.findElements(By.xpath("//h2[contains(text(),'Historical Gold Rates')]/../..//td[1]"));
		List<WebElement> gold22k = driver.findElements(By.xpath("//h2[contains(text(),'Historical Gold Rates')]/../..//td[2]//div[contains(text(),'₹')]"));
		int rows = days.size();
		//System.out.println(rows);
		for(int i=0;i<rows;i++)
		{
			System.out.println(days.get(i).getText()+" ----> "+gold22k.get(i).getText());
		}
		driver.quit();
		 
	}

}
