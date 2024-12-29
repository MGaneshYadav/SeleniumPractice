import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SvgTagTaskPetDisease {

	@Test
	public void petTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://petdiseasealerts.org/forecast-map/#/heartworm-canine/dog/united-states");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		driver.switchTo().frame(0);
		Thread.sleep(2000);

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		Actions action=new Actions(driver);
		WebElement hawaii = driver.findElement(By.xpath("//*[name()='svg' and @id='map-svg']//*[name()='g' and @id='hawaii']"));
		action.contextClick(hawaii).perform();
		//wait.until(ExpectedConditions.elementToBeClickable(columbia));


		
		
		
		
		

//		List<WebElement> regions = driver.findElements(By.xpath("//*[name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']"));
////        int alllinks=0;
////		for(WebElement e:regions)
////		{
////			System.out.println(e.getAttribute("id"));
////			alllinks++;
////		}
////		System.out.println(alllinks);
////		System.out.println("===========================================");
//
//		int count=0;
//		for(int i=0;i<regions.size();i++)
//		{
//
//			try 
//			{
//				regions.get(i).click();
//				try 
//				{
//					WebElement infectionRate = driver.findElement(By.xpath("//span[@class='infection-rate-number']"));
//					System.out.println(regions.get(i).getAttribute("id")+"--->"+infectionRate.getText());
//					Thread.sleep(2000);
//				}
//				catch(NoSuchElementException e)
//				{
//
//					WebElement noData = driver.findElement(By.xpath("//h3[text()='No data']"));
//					System.out.println(regions.get(i).getAttribute("id")+"--->"+noData.getText());
//					Thread.sleep(2000);
//				}
//				count++;
//				driver.findElement(By.xpath("//a[text()='United States']")).click();
//				Thread.sleep(2000);
//			}
//			catch (ElementClickInterceptedException e) 
//			{
//				i++;
//			}
//			Thread.sleep(2000);
//		}
//		System.out.println(count);
//		driver.quit();
	}

}
