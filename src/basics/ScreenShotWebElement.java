package basics;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		LocalDateTime dateTime=LocalDateTime.now();
		String date=dateTime.toString().replaceAll(":", "-");
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		File source=searchButton.getScreenshotAs(OutputType.FILE);
		File des=new File("./ScreenShot/Element"+date+".jpg");
		try {
			FileHandler.copy(source, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}
