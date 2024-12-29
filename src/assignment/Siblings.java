package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ganesh%20yadav/OneDrive/Desktop/HTML%20Custom%20Pages/xpath%20(1).html");
		driver.findElement(By.xpath("//input[1]")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//input[1]/following-sibling::input")).sendKeys("gana1234");
		driver.findElement(By.xpath("//input[1]/following-sibling::input/following-sibling::button")).click();
		driver.quit();
		//(//span[@class='price actual-price'])[1]/parent::div/parent::div/preceding-sibling::div/preceding-sibling::h2/child::a

	}

}
