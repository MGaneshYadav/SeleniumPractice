package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHiddenTextfield {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.facebook.com/signup");
		WebElement hiddenTextfield = driver.findElement(By.name("custom_gender"));
		driver.executeScript("arguments[0].value='welcome to testyantra'", hiddenTextfield);
	}

}
