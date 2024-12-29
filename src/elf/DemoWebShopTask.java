package elf;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTask {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("//a[text()='Fiction']/../..//input")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		driver.findElement(By.xpath("//a[text()='Music 2']/../..//input")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/../..//input")).click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		List<WebElement> itemPrice = driver.findElements(By.xpath("//tbody//span[@class='product-unit-price']"));
		ArrayList<Double> a=new ArrayList<Double>();
		for(WebElement ele:itemPrice)
		{
			String price=ele.getText();
			double value=Double.parseDouble(price);
			a.add(value);
			
		}
		double minimum = a.get(0); 
        for (int i = 1; i < a.size(); i++) 
        { 
            if (minimum > a.get(i)) 
                minimum = a.get(i);
        }
        String lowPrice="";
        lowPrice=lowPrice+minimum;
        driver.findElement(By.xpath("//tbody//span[contains(text(),'"+lowPrice+"')]/../..//input[@name='removefromcart']")).click();
        driver.findElement(By.xpath("//input[@name='updatecart']")).click();
        driver.quit();

	}

}
