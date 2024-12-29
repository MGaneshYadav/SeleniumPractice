package task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sbiTask {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(" https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
		driver.findElement(By.linkText("Forgot Username / Login Password")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		childWindow.remove(parentWindow);
		for(String window:childWindow)
		{
			driver.switchTo().window(window);
			Dimension size = driver.manage().window().getSize();
			int height = size.getHeight();
			int width = size.getWidth();
			Dimension set = new Dimension(width+100,height+100);
			driver.manage().window().setSize(set);
			driver.findElement(By.id("nextStep")).click();
			
			WebElement userName = driver.findElement(By.id("userName"));
			userName.sendKeys(" ");
			next(driver);
			userName.clear();
		
			userName.sendKeys("Ganesh");
			next(driver);
			
			WebElement acountNo = driver.findElement(By.id("accountNo"));
			acountNo.sendKeys("1234567");
			next(driver);
			acountNo.clear();
			
			acountNo.sendKeys("12345678912");
			next(driver);
			
			WebElement selectCountry = driver.findElement(By.id("selCountry"));
			Select select=new Select(selectCountry);
			select.selectByValue("91");
			next(driver);
			
			WebElement mobileNo = driver.findElement(By.id("mobileNo"));
			mobileNo.sendKeys("12345");
			next(driver);
			mobileNo.clear();
			
			mobileNo.sendKeys("7685342519");
			next(driver);
			
			
			WebElement date = driver.findElement(By.id("datepicker5"));
			date.sendKeys("29/02/2023");
			next(driver);
			date.clear();
			
			date.sendKeys("25/02/2023");
			next(driver);
		}
		
	}
	public static void next(WebDriver driver)
	{
		driver.findElement(By.id("go")).click();
		alertMethod(driver);
	}
	public static void alertMethod(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

}
