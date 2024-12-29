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

public class BrokenLink {
	
	@Test
	public void brokenLink() throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+allLinks.size());
		int broken=0,notBroken=0;
		for(WebElement links:allLinks)
		{
			String urlText = links.getAttribute("href");
			try
			{
			URL url=new URL(urlText);
			HttpURLConnection httpConnection=(HttpURLConnection)url.openConnection();
			int code = httpConnection.getResponseCode();
			if(code>=400)
			{
				
				System.out.println("Link is broken: " +urlText);
				broken++;
			}
			else
			{
				System.out.println("Link1 is not broken: "+urlText);
				notBroken++;
			}
			}
			catch (Exception e) {
				System.out.println("Link2 is not broken: "+urlText);
				notBroken++;
			}
			
		}
		System.out.println("Total number of broken links: "+broken );
		System.out.println("Total number of not broken links: "+notBroken );
		driver.quit();
		
	}
	

}
