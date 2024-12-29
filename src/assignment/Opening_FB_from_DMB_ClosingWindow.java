package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_FB_from_DMB_ClosingWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Set<String> childWindow = driver.getWindowHandles();
		for(String window:childWindow)
		{
			driver.switchTo().window(window);
			if(!(driver.getTitle().equalsIgnoreCase("Demo Web Shop")))
			{

				driver.close();
			}
		}
		driver.quit();

	}

}
