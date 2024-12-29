import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWebPage {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		ts.getScreenshotAs(OutputType.FILE);
		WebElement register = driver.findElement(By.linkText("Register"));
		File source=register.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Ganesh yadav\\OneDrive\\Pictures\\Screenshots\\DMWRegister.jpg");
		Files.copy(source, des);
		driver.quit();
		

	}

}
