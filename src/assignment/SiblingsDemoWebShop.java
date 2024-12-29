package assignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;



public class SiblingsDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("(//h2/following-sibling::div/following-sibling::div/following-sibling::div/child::div/following-sibling::div/child::input)[1]")).click();
		//driver.findElement(By.xpath("(//h2/following-sibling::div/following-sibling::div/following-sibling::div/child::div/following-sibling::div/child::input)[1]")).click();
		//Thread.sleep(5000);
		driver.quit();

	}

}
