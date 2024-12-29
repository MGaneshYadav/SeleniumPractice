import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountOfBrokenLinksInPage {

	public static void main(String[] args) throws IOException {


		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'.')]"));
		System.out.println(links.size());
		int count=0;
		for(WebElement ele:links)
		{
			String urlText = ele.getAttribute("href");
			URL url=new URL(urlText);
			HttpURLConnection httpConnection=(HttpURLConnection) url.openConnection();
			//System.out.println(httpConnection.getResponseCode());
			if(httpConnection.getResponseCode()>=400)
			{
				count++;
				System.out.println(httpConnection.getResponseCode()+"-->"+ele.getText()+"---->"+"brokenLink");
			}
		}
		System.out.println(count);
		driver.quit();
		
		
	}

}
