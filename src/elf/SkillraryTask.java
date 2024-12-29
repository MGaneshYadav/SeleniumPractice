package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.skillrary.com/user/login");
		WebElement yesRadioButton = driver.findElement(By.id("usertype_yes"));
	
		if(yesRadioButton.isEnabled()==true)
		{
			System.out.println("Radio button is enabled");
			yesRadioButton.click();
			WebElement groupcode = driver.findElement(By.id("groupcode"));
			if(groupcode.isDisplayed())
			{
				System.out.println("Group code textfield is Displayed");
			}
			else
			{
				System.out.println("Group code textfield is not displayed");
			}
		}
		else
		{
			System.out.println("Radio button is not enabled");
		}
		driver.quit(); 
	}

}
