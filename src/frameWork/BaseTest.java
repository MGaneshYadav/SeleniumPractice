package frameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void browserSetup(@Optional("chrome") String browserName)
	{
		if(browserName.contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browserName.contains("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.contains("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter the valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void browserTearDown()
	{
		driver.quit();
	}

}
