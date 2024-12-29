package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRaryDisabledTextboxWithJS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledTextbox = driver.findElement(By.xpath("//input[@class='form-control']"));
		driver.executeScript("arguments[0].value='Ganesh'", disabledTextbox);

	}

}
