package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions action=new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		action.moveToElement(electronics).build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Camera, photo')])[1]"))).click().perform();
		driver.quit();

	}

}
