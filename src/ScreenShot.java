import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//For Web page Screen shot
//		driver.get("https://demowebshop.tricentis.com/");
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		File des=new File("C:\\Users\\Ganesh yadav\\OneDrive\\Pictures\\Screenshots\\Folder\\screenshot1.png");
//		Files.copy(source, des);
		
		
		//for Element ScreenShot
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Register']"));
		File source=ele.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Ganesh yadav\\OneDrive\\Pictures\\Screenshots\\Folder\\elementscreenshot.png");
		Files.copy(source, des);
		driver.quit();
		
	}
}
