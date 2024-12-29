package SS_SignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_SignUp_005 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("vertical-tab-0")).click();
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		WebElement singIn_link = driver.findElement(By.id("signIn"));
		Actions action=new Actions(driver);
		action.moveToElement(singIn_link).perform();
		driver.quit();

	}

}
