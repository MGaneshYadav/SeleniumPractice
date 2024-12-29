package SS_Admin_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Integration_07 {

	public static void main(String[] args) {
		
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
		driver.findElement(By.id("full-width-tab-0")).click();
		WebElement approvedMerchantsText = driver.findElement(By.xpath("//h6"));
		String expecteAM="Approved Merchants";
		String actualAM=approvedMerchantsText.getText();
		if(actualAM.equals(expecteAM))
		{
			System.out.println("Approved merchants list was displayed.");
		}
		else
		{
			System.out.println("Approved merchants list not displayed.");
		}
		driver.quit();

	}

}
