package elf;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloRightClick {

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
		WebElement inProcess = driver.findElement(By.xpath("//a[text()='In Progress']"));
		Actions action=new Actions(driver);
		action.contextClick(inProcess).perform();
		List<WebElement> options = driver.findElements(By.xpath("//div[@data-testid='quick-card-editor-buttons']"));
		for(WebElement e:options)
		{
			System.out.println(e.getText());
		}
	}

}
