package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("laptops");
		Thread.sleep(2000);
		driver.quit();
	}

}
