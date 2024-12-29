package elf;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PageScreenShot {
	public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.purplle.com/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File capture=ts.getScreenshotAs(OutputType.FILE);
	File source=new File("./CaptureScreenshot/page.png");
	FileHandler.copy(capture, source);
	driver.quit();
	
	
	}


}
