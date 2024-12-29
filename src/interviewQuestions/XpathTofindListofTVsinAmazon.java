package interviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class XpathTofindListofTVsinAmazon {

	@Test
	public void listOfTvs()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart tv",Keys.ENTER);
		List<WebElement> listOfTvs = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		Reporter.log("List of TVs are");
		for(WebElement e:listOfTvs)
		{
			System.out.println(e.getText());
		}
		driver.quit();
	}
}
