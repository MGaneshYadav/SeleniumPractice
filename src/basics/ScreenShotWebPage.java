package basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotWebPage {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		WebPageScreenShot("TestCase1");
		driver.quit();
	}
	public static void WebPageScreenShot(String filename)
	{
		LocalDateTime dateTime=LocalDateTime.now();
		String Date=dateTime.toString().replaceAll(":", "-");
		System.out.println(Date);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./ScreenShot/"+filename+Date+".png");
		try {
			FileHandler.copy(source, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}