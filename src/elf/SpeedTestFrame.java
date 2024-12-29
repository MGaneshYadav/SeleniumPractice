package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpeedTestFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.speedtest.net/");
		driver.switchTo().frame("google_ads_iframe_/6692/speedtest.net/stnext_lowerboard_0");
		driver.findElement(By.id("cbb")).click();
	}

}
