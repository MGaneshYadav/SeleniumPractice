package crossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Buffalo {
	
	@Parameters("browser")
	@Test
	public void buffalo(@Optional("chrome") String browserName)
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			Reporter.log("Invalid browser name",true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.buffalo-boots.com/");
		Reporter.log("Buffalo shoe website launched successfully",true);
		driver.quit();
	}

}
