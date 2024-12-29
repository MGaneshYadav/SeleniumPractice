package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ganesh%20yadav/OneDrive/Desktop/HTML%20Custom%20Pages/MultipleWindow%20(1).html");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);
		for(String window:childWindow)
		{
			driver.switchTo().window(window);
			if(!(driver.getTitle().equals("Multiple popups")))
			{
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.quit();
		

	}

}
