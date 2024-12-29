package elf;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReddiffMail {

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		
		driver.findElement(By.xpath("//input[@id='TO_IDcmp2']")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//li[@class='fld_sub']/input")).sendKeys("mail");
		WebElement textAreaFrame = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		driver.switchTo().frame(textAreaFrame);
		driver.findElement(By.xpath("//body[@spellcheck='true']")).sendKeys("Good Evining All");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		WebElement successMsg = driver.findElement(By.xpath("//div[contains(text(),'Your mail has been sent')]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(successMsg));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./CaptureScreenshot/SuccessMail.png");
		FileHandler.copy(source, des);
		
		WebElement refreshButton = driver.findElement(By.xpath("//cite[@title='Refresh Inbox']"));
		wait.until(ExpectedConditions.elementToBeClickable(refreshButton));
		refreshButton.click();
		driver.findElement(By.xpath("//span[@title='mail']/../cite")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		
		WebElement deletedMsg = driver.findElement(By.xpath("//div[contains(text(),'1 mail deleted successfully')]"));
		wait.until(ExpectedConditions.visibilityOf(deletedMsg));
		File source1=ts.getScreenshotAs(OutputType.FILE);
		File des1=new File("./CaptureScreenshot/DeletedMail.png");
		FileHandler.copy(source1, des1);
		
		driver.quit();
	}

}
