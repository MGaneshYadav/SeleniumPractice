package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ganesh%20yadav/Downloads/xpath1%20(1).html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Ganesh");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("yadav");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("testyantra");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("bangalore");
		driver.quit();
	}

}
