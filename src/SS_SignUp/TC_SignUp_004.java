package SS_SignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SignUp_004 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("vertical-tab-0")).click();
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver.findElement(By.id("signIn")).click();
		driver.quit();

	}

}
