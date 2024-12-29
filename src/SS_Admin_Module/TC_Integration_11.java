package SS_Admin_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_Integration_11 {

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
		driver.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root MuiButton-root')])[1]")).click();
		WebElement columnDropDown = driver.findElement(By.xpath("(//select)[2]"));
		Select selectColumn=new Select(columnDropDown);
		selectColumn.selectByIndex(1);
		WebElement operatorDropDown = driver.findElement(By.xpath("(//select)[3]"));
		Select selectOperator=new Select(operatorDropDown);
		selectOperator.selectByVisibleText("is empty");
		WebElement filtersbtn = driver.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root MuiButton-root')])[1]"));
		Actions action =new Actions(driver);
		action.moveToElement(filtersbtn).perform();
		driver.quit();

	}

}
