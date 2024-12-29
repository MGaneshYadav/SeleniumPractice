import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SvgTagTaskSS {
	
	@Test
	public void favoriteTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("ganesh1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gana@0918");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		Actions action=new Actions(driver);
//		WebElement featuredProducts = driver.findElement(By.xpath("//h1[text()='Featured Products']"));
//		action.scrollToElement(featuredProducts);
//		wait.until(ExpectedConditions.visibilityOf(featuredProducts));
		
		driver.findElement(By.xpath("//img[@alt='men']")).click();
		WebElement favoriteIcon = driver.findElement(By.xpath("//*[name()='svg' and @data-testid='FavoriteIcon']"));
		System.out.println(favoriteIcon.getCssValue("fill"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @data-testid='FavoriteIcon']")).click();
		Thread.sleep(2000);
		System.out.println(favoriteIcon.getCssValue("fill"));
		
		Thread.sleep(3000);
		driver.quit();
	}

}
