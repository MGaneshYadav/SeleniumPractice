package SS_SignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_001 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		WebElement loginPage = driver.findElement(By.xpath("//a[text()='Login']"));
		if(loginPage.isDisplayed())
		{
			System.out.println("Login page is displayed");
		}
		driver.quit();
	}

}
