package elf;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoldRateTableTask {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		List<WebElement> gram = driver.findElements(By.xpath("(//table)[1]//td[contains(@style,'padding-left')]"));
		List<WebElement> today = driver.findElements(By.xpath("(//table)[1]//td[contains(@style,'padding-top: 16px; padding-bottom: 16px; text-align: right')]//div[contains(text(),'-')]/../div[contains(text(),'₹')]"));
		int rows = gram.size();
		for(int i=0;i<rows;i++)
		{
			System.out.println(gram.get(i).getText() +" ---> "+today.get(i).getText());
		}
		driver.quit();
		
	}

}
