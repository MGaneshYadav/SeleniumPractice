package elf;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipcartToAddToCartAndRemove {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		addToCart("iphone", driver);
		addToCart("realme", driver);
		addToCart("poco", driver);
		Actions action=new Actions(driver);
		driver.findElement(By.linkText("Cart")).click();
		action.scrollByAmount(0, 947).pause(Duration.ofSeconds(2)).perform();
		driver.findElement(By.xpath("//a[contains(text(),'iPhone')]/../../../..//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
	}
	public static void addToCart(String itemName,WebDriver driver) throws InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(itemName,Keys.ENTER);
		WebElement productClick = driver.findElement(By.xpath("//img[@loading='eager']"));
		wait.until(ExpectedConditions.elementToBeClickable(productClick));
		driver.findElement(By.xpath("//img[@loading='eager']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		childWindow.remove(parentWindow);
		for(String window:childWindow)
		{
		    driver.switchTo().window(window);
		    driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		    driver.close();
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"A",Keys.BACK_SPACE);
	}

}
