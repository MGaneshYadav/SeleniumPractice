import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenMail {

	public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:9222");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("ganeshmekala977@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		driver.quit();
	}

}
