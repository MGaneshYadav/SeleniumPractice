package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ganesh%20yadav/OneDrive/Desktop/HTML%20Custom%20Pages/demo%20(1).html");
		List<WebElement> nameText = driver.findElements(By.xpath("(//tbody)[6]//following-sibling::td"));
		for(int i=0;i<nameText.size();i=i+2)
		{
			System.out.println(nameText.get(i).getText());
		}
		driver.quit();

	}

}
