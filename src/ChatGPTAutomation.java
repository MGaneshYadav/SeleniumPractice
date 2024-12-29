import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChatGPTAutomation {
	
	@Test
	public void search()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://chatgpt.com/");
		driver.findElement(By.xpath("//textarea[@placeholder='Message ChatGPT']")).sendKeys("selenium",Keys.ENTER);
	}

}
