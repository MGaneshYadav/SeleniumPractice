package learningTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethodAttribute {
	@Test(priority=1)
	public void samsung()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.samsung.com/in/");
		Reporter.log("Samsung website launched successfully",true);
		driver.quit();
	}
	
	@Test(priority=2,dependsOnMethods = "samsung")
	public void realme()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.realme.com/in/");
		Reporter.log("Realme website launched successfully",true);
		driver.quit();
	}
	
	@Test(priority=3,dependsOnMethods = "apple")
	public void oppo()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oppo.com/in/");
		Reporter.log("Oppo website launched successfully",true);
		driver.quit();
	}
	@Test(priority=4,dependsOnMethods = {"realme","samsung"})
	public void apple()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.apple.com/in/");
		Reporter.log("Apple website launched successfully",true);
		driver.quit();
	}

}
