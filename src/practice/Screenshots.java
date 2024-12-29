package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshots {
	
	@Test
	public void caputureScreenshot() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		File source=loginBtn.getScreenshotAs(OutputType.FILE);
//		File des=new File("C:\\Users\\Ganesh yadav\\OneDrive\\Desktop\\Screenshots\\WebpageScreenshot.png");
//		FileHandler.copy(source, des);
		
		
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		File source=loginBtn.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Ganesh yadav\\OneDrive\\Desktop\\Screenshots\\WebElementScreenshot.png");
		FileHandler.copy(source, des);
		 
		Thread.sleep(3000);
		driver.quit();
	}

}
