package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapitalLettersUsingShiftkey {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions action=new Actions(driver);
		WebElement search = driver.findElement(By.id("small-searchterms"));
		action.keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform();
	

	}

}
