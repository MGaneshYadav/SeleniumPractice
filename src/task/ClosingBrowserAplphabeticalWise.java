package task;

import java.net.SocketException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.poifs.property.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClosingBrowserAplphabeticalWise {

	public static void main(String[] args) throws InterruptedException, SocketException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get(" C:/Users/Ganesh%20yadav/Downloads/TestPage.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click   Here')]")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.numberOfWindowsToBe(5));
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindows = driver.getWindowHandles();
		//childWindows.remove(parentWindow);
		
		TreeSet<String> treeSet=new TreeSet<>();
		for (String window: childWindows) 
		{
			driver.switchTo().window(window);
			treeSet.add(driver.getTitle());
		}
		
		ArrayList<String> arrayList=new ArrayList<>(treeSet);
		for(int i=0;i<arrayList.size();i++)
		{
			for(String window:childWindows) 
			{
				driver.switchTo().window(window);
				if((arrayList.get(i)).equals(driver.getTitle()))
				{
					//Thread.sleep(2000);
					System.out.println(driver.getTitle());
					driver.close();
					childWindows=driver.getWindowHandles();
					driver.switchTo().window(parentWindow);
				}
			}
		}
		//driver.quit();

	}
}


