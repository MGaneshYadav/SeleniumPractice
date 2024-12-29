import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithBrokenLink {

	public static void main(String[] args) throws IOException {

		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(WebElement e:links)
		{
		String urlText = e.getAttribute("href");
		URL url=new URL(urlText);
		HttpURLConnection httpConnection=(HttpURLConnection) url.openConnection();
		httpConnection.setRequestMethod("HEAD");
		httpConnection.connect();
		//System.out.println(httpConnection.getResponseCode());
		if(httpConnection.getResponseCode()>=400)
		{
			System.out.println("Broken link present");
		}
		}
		driver.quit();
	}

}
