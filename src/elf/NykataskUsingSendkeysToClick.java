package elf;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NykataskUsingSendkeysToClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.nykaafashion.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Puma"," ","Shoe",Keys.ENTER);
		driver.quit();

	}

}
