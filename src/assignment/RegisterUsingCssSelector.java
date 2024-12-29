package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUsingCssSelector {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.cssSelector("#gender-male")).click();
		driver.findElement(By.cssSelector("#FirstName")).sendKeys("gana");
		driver.findElement(By.cssSelector("#LastName")).sendKeys("yadav");
		driver.findElement(By.cssSelector("#Email")).sendKeys("gana@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("ga1234");
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ga1234");
		driver.findElement(By.cssSelector(".button-1.register-next-step-button")).click();
		driver.quit();
		
	}

}
