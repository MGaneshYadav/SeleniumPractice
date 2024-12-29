package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SkillRaryMultipleSelection {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement courses = driver.findElement(By.id("cars"));
		
		Select select=new Select(courses);
		select.selectByIndex(0);
		select.selectByValue("299");
		select.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		System.out.println(select.getFirstSelectedOption().getText());
	
		select.deselectByIndex(1);
		select.deselectByValue("299");
		select.deselectByVisibleText("Free ( 90 )");
	}

}
