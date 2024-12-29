package shoes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bata {
	@Test(groups = "Regression",dependsOnGroups = "Smoke")
	public void bata()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bata.com/in/");
		Reporter.log("Bata shoe website launched successfully",true);
		driver.quit();
	}

}
