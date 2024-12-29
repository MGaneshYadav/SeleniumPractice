package SS_Admin_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Integration_02 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("vertical-tab-2")).click();
		driver.findElement(By.id("Email")).sendKeys("ganesh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gana@0918");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.cssSelector("svg[data-testid='SettingsIcon']")).click();
		driver.findElement(By.cssSelector("svg[data-testid='PersonIcon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		WebElement lastName = driver.findElement(By.xpath("//input[@id='Last Name']"));
		lastName.clear();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='M';", lastName);
		driver.findElement(By.id("Submit")).click();
		WebElement cancelbtn = driver.findElement(By.cssSelector(".Toastify__close-button.Toastify__close-button--light"));
		js.executeScript("arguments[0].click();", cancelbtn);
		driver.findElement(By.cssSelector("svg[data-testid='SettingsIcon']")).click();
		driver.findElement(By.cssSelector("svg[data-testid='PersonIcon']")).click();
		Thread.sleep(2000);
		WebElement lastNameText = driver.findElement(By.xpath("(//td)[2]"));
		String expectedLName="M";
		String actualLName=lastNameText.getText();
		if(actualLName.equals(expectedLName))
		{
			System.out.println("Proper last name was displayed.");
		}
		else
		{
			System.out.println("Proper last name not displayed.");
		}
		driver.quit();

	}

}
