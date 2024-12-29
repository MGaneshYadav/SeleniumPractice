package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsFor_AdvanceSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement DWS_icon = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		if(DWS_icon.isDisplayed())
		{
			System.out.println("DemoWebShop is Launched succesfully");
			driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
			driver.findElement(By.id("As")).click();
			driver.findElement(By.id("Isc")).click();
			driver.findElement(By.id("Pf")).sendKeys("10");
			driver.findElement(By.id("Pt")).sendKeys("100");
			driver.findElement(By.id("Sid")).click();
			driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		}

	}

}
