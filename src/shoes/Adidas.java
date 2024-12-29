package shoes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Adidas {
	@Test(groups = {"Smoke","Regression"})
	public void adidas()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.adidas.co.in/shoes");
		Reporter.log("Adidas shoe website launched successfully",true);
		driver.quit();
	}

}
