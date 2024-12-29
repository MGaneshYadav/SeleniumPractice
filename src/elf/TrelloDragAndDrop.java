package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloDragAndDrop {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("Ganesh Yadav Mekala");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("username")).sendKeys("ganesh.m@testyantra.in");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Gana@0918");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//div[@title='Selenium Training']")).click();
		WebElement source = driver.findElement(By.xpath("//a[text()='In Progress']"));
		WebElement des = driver.findElement(By.xpath("//h2[text()='Selenium']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, des).perform();
	}

}
