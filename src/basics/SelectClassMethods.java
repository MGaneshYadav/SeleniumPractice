package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ganesh%20yadav/OneDrive/Desktop/HTML%20Custom%20Pages/demo%20(1).html");
		WebElement dropDownCars = driver.findElement(By.id("standard_cars"));
		Select select=new Select(dropDownCars);
		select.selectByVisibleText("Audi");
		select.selectByValue("for");
		select.selectByIndex(5);
		driver.quit();

	}

}
