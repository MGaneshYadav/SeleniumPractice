package elf;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodToSelectLastOption {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		dropdown(dayDropdown);
		
	}
	public static void dropdown(WebElement dayDropdown)
	{
		Select select=new Select(dayDropdown);
		select.selectByIndex(select.getOptions().size()-1);

	}

}
