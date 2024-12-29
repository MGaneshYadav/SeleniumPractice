package elf;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpeningBrowserInIncognitoMode {

	public static void main(String[] args) {


		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(" https://www.easemytrip.com/");
	}

}
