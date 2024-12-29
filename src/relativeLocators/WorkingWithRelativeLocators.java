package relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WorkingWithRelativeLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//above()
		//below()
		//toLeft()
		//toRight()
		//near()
		driver.findElement(RelativeLocator.with(By.linkText("Register")).above(By.id("small-searchterms"))).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
