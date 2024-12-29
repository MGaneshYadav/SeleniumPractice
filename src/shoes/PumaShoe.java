package shoes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PumaShoe {
	
	@Test(groups = "Functional")
	public void puma()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://in.puma.com/in");
		Reporter.log("Puma shoe website launched successfully",true);
		driver.quit();
	}

}
