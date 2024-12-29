import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLinksForDWS {
	
	@Test
	public void brokenlinks() throws InterruptedException, IOException
	{
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		options.addArguments("--ignore-certificate-errors");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'.')]"));
		int count=0;
		for(WebElement e:links)
		{
			count++;
			//System.out.println(e.getAttribute("href"));
			String urlText = e.getAttribute("href");
			URL url=new URL(urlText);
			HttpURLConnection httpConnection=(HttpURLConnection)url.openConnection();
			if(httpConnection.getResponseCode()>=400)
			{
				System.out.println(httpConnection.getResponseCode()+" --> "+e.getText()+" ---> Broken Link");
			}
			
		}
		System.out.println(count);
		driver.quit();
		
	}
}
