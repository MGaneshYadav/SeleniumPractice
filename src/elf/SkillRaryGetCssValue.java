package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class SkillRaryGetCssValue {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.xpath(" //button[@type='submit']")).click();
		WebElement errorMessage = driver.findElement(By.id("email-error"));
		System.out.println(errorMessage.getCssValue("color"));
		System.out.println(errorMessage.getCssValue("display"));
		System.out.println(errorMessage.getCssValue("font-size"));
		Color ref = new Color(255, 0, 0, 0);
		System.out.println(ref.asRgb());
		driver.quit();
	}

}
