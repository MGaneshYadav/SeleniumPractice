package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsFor_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement DWS_icon = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		if(DWS_icon.isDisplayed())
		{
			System.out.println("DemoWebShop is Launched succesfully");
		}
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement login_text = driver.findElement(By.xpath("//h1"));
		if(login_text.isDisplayed())
		{
			System.out.println("Log in page is Displayed.");
		}
		driver.findElement(By.id("Email")).sendKeys("gana@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ga1234");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	}

}
